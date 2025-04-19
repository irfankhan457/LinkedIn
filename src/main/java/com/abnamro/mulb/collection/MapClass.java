package com.abnamro.mulb.collection;

import java.util.*;

public class MapClass {
    public static void main(String[] args) {
        Hashtable<String, String> studentMap = new Hashtable<>();

        studentMap.put("John", "khan");
        studentMap.put("Jane", "pathan");
        studentMap.put("Jack", "baig");
        studentMap.put("Jill", "Mirja");
        studentMap.put("John", "galib"); // This will overwrite the previous value for "John"
        studentMap.put("John", "akhtar");



        Iterator<String> iterator = studentMap.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            if (key.equals("John")) {
                iterator.remove(); // Safe removal
            }
        }

        for (String key : studentMap.keySet()) {
            System.out.println("After Removal John " + key + " : " + studentMap.get(key));
        }
    }
}