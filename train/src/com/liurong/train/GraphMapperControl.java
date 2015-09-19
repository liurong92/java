package com.liurong.train;

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
        long totalDistance = 5;


        return Long.toString(totalDistance);
    }



    public String[] splitInput(String input) {
        return input.trim().split(", ");
    }
}
