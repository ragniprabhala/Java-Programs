package com.softworld.collections;

import java.util.HashMap;
import java.util.Map;

public class MapFromArrayExample {
    public static void main(String[] args) {
        String[] keys = {"A", "B", "C"};
        Integer[] values = {1, 2, 3};

        Map<String, Integer> map = new HashMap<String ,Integer>();
        for (int i = 0; i < keys.length; i++) {
            map.put(keys[i], values[i]);
        }

        System.out.println("Map from arrays: " + map);
    }
}
