package com.liurong.train;


import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

public class GraphMapper {
    private LinkedHashMap<String, HashMap<String, Integer>> graphMapper;

    public GraphMapper() {
        graphMapper = new LinkedHashMap<>();
    }

    public Set<String> getStartNodeSet() {
        return graphMapper.keySet();
    }

    public void addNearbyNode(String startNode, String nearbyNode, int distance) {
        addStartNode(startNode);
        graphMapper.get(startNode).put(nearbyNode, distance);
    }

    public void addStartNode(String startNode) {
        if(!graphMapper.containsKey(startNode)) {
            graphMapper.put(startNode, new HashMap<String, Integer>());
        }
    }

    public Set<String> getNearbyNodeKeys(String startNode) {
        if(graphMapper.get(startNode) == null){
            return new HashSet<>();
        }
        return graphMapper.get(startNode).keySet();
    }

    public HashMap<String, Integer> getNearbyNode(String startNode) {
        if(graphMapper.get(startNode) ==null){
            return new HashMap<>();
        }
        return graphMapper.get(startNode);
    }

    public long getDistance(String startNode, String endNode) throws NoSuchRouteException {
        try {
            return graphMapper.get(startNode).get(endNode);
        } catch (Exception e) {
            throw new NoSuchRouteException("No Such Route");
        }
    }
}
