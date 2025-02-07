package org.learning.assignment.assignment1;

import java.util.HashMap;
import java.util.Map;

public class KeyValuesInHashMap {
    // Write a program to get set of keys and values of hashmap
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('a', 2);
        map.put('b', 1);
        map.put('c', 7);
        map.put('d', 10);

        System.out.println("Set of Keys :" + map.keySet());
        System.out.println("Set of Values :" + map.values());
    }
}
