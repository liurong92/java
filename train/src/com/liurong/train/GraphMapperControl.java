package com.liurong.train;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.SynchronousQueue;

public class GraphMapperControl {

    public GraphMapper getMapper(String input) {
        String[] valuesArray = input.split(", ");
        GraphMapper graphMapper = new GraphMapper();

        for (String value : valuesArray) {
            String start = value.substring(0, 1);
            String end = value.substring(1, 2);
            Integer distance = Integer.valueOf(value.substring(2));
            graphMapper.addNearbyNode(start, end, distance);
        }
        return graphMapper;
    }

    public String getTotalDistance(GraphMapper graphMapper, String path) {
        long totalDistance = 0;
        char[] pathArray = path.toCharArray();

        try {
            String start = String.valueOf(pathArray[0]);
            for (int i = 1; i < pathArray.length; i++) {
                totalDistance += graphMapper.getDistance(start, String.valueOf(pathArray[i]));
                start = String.valueOf(pathArray[i]);
            }
        } catch (NoSuchRouteException e) {
            return e.getMessage();
        }
        return Long.toString(totalDistance);
    }

    public Integer getPathCount(GraphMapper graphMapper, String startNode, String endNode, int maxStop, boolean countMax) {
        int pathCount = 0;
        HashMap<String, Integer> presentMapper = new HashMap<>();
        presentMapper.put(startNode, 1);

        HashMap<String, Integer> nextMapper;

        for (int i = 0; i < maxStop; i++) {
            nextMapper = new HashMap<>();
            for (String key : presentMapper.keySet()) {
                int numberNode = presentMapper.get(key);
                for (String graphNode : graphMapper.getNearbyNodeKeys(key)) {
                    int num = nextMapper.containsKey(graphNode) ? nextMapper.get(graphNode) : 0;
                    nextMapper.put(graphNode, num + numberNode);
                }
            }
            if (nextMapper.containsKey(endNode)) {
                pathCount += nextMapper.get(endNode);
            }
            presentMapper = nextMapper;
        }
        if(countMax) {
            if(presentMapper.containsKey(endNode)){
                return presentMapper.get(endNode);
            }
        }

        return pathCount;
    }

    public String getShortDistance(GraphMapper graphMapper, String startNode, String endNode) {
        Long shortDistance = null;

        HashMap<String, Long> nextDistanceMapper;
        HashMap<String, Long> presentDistanceMapper = new HashMap<>();
        presentDistanceMapper.put(startNode, 0L);

        int count = 0;

        while(count < graphMapper.getStartNodeSet().size()){
            count ++;
            nextDistanceMapper = new HashMap<>();
            for(String start: presentDistanceMapper.keySet()){
                for(String end: graphMapper.getNearbyNodeKeys(start)){
                    try{
                        long addedDistance = graphMapper.getDistance(start, end);
                        long newDistance = presentDistanceMapper.get(start) + addedDistance;
                        if(endNode.equals(end)){
                            if(shortDistance == null || shortDistance > newDistance)
                                shortDistance = newDistance;
                        } else {
                            nextDistanceMapper.put(end, newDistance);
                        }
                    }catch (NoSuchRouteException e) {
                    }
                }
            }
            presentDistanceMapper = nextDistanceMapper;
        }
        if(shortDistance != null){
            return shortDistance.toString();
        }
        return "No Distance";
    }

    public int getAllPathLessThanDistance(GraphMapper graphMapper, String startNode, String endNode, int maxDistance) {
        int path = 0;

        LinkedHashMap<String, Integer> pathDistanceMapper = getPathDistanceMapper(graphMapper, startNode, maxDistance);
        System.out.println(pathDistanceMapper.keySet());
        for (String route : pathDistanceMapper.keySet()) {
            System.out.println(route);
            if (route.endsWith(endNode) && !route.equals(startNode)) {
                path++;
            }
        }
        return path;
    }

    private LinkedHashMap<String, Integer> getPathDistanceMapper(GraphMapper graphMapper, String startNode, int maxDistance) {
        LinkedHashMap<String, Integer> pathDistanceMapper = new LinkedHashMap<>();

        ArrayList<String> presentPaths = new ArrayList<>();
        ArrayList<String> nextPaths;
        pathDistanceMapper.put(startNode, 0);
        presentPaths.add(startNode);

        while (presentPaths.size() > 0) {
            nextPaths = new ArrayList<>();
            for (String presentPath : presentPaths) {
                String lastStop = presentPath.substring(presentPath.length() - 1);
                HashMap<String, Integer> presentNodes = graphMapper.getNearbyNode(lastStop);
                if (presentNodes != null) {
                    for (String adjacentKey : presentNodes.keySet()) {
                        Integer presentDistance = pathDistanceMapper.get(presentPath);
                        String newPath = presentPath + adjacentKey;
                        Integer newDistance = presentDistance + presentNodes.get(adjacentKey);
                        if (newDistance < maxDistance) {
                            nextPaths.add(newPath);
                            pathDistanceMapper.put(newPath, newDistance);
                        }
                    }
                }
            }
            presentPaths.clear();
            presentPaths.addAll(nextPaths);
        }
        return pathDistanceMapper;

    }
}
