package com.liurong.train;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;

public class GraphMapperControl {

    public GraphMapper getMapper(String input) {
        String[] valuesArray = input.split(", ");
        GraphMapper graphMapper = new GraphMapper();

        for(String value : valuesArray) {
            String start = value.substring(0,1);
            String end = value.substring(1,2);
            Integer distance = Integer.valueOf(value.substring(2));
            graphMapper.addNearbyNode(start, end, distance);
        }
        return graphMapper;
    }

    public String getTotalDistance(GraphMapper graphMapper, String path){
        long totalDistance = 0;
        char[] pathArray = path.toCharArray();
        String start = String.valueOf(pathArray[0]);

        for(int i = 1; i < pathArray.length; i++) {
            totalDistance += graphMapper.getDistance(start, String.valueOf(pathArray[i]));
            start = String.valueOf(pathArray[i]);
        }
        return Long.toString(totalDistance);
    }

    public String[] splitInput(String input) {
        return input.trim().split(", ");
    }
}
