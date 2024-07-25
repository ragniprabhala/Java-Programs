package com.softworld.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapIterationExample {
    public static void main(String[] args) {
        Map<String, Integer> populationMap = new TreeMap<String,Integer>();
        populationMap.put("USA", 331);
        populationMap.put("China", 1441);
        populationMap.put("India", 1380);
        populationMap.put("Brazil", 212);

        for (Map.Entry<String, Integer> entry : populationMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " million");
        }
    }
}
