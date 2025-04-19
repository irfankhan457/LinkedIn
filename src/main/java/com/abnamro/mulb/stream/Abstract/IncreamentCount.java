package com.abnamro.mulb.stream.Abstract;

import javax.swing.plaf.TableHeaderUI;
import java.util.*;

public class IncreamentCount {



    public static void main(String[] args) {
        String str ="hello";
        char[] charArray = str.toCharArray();
        TreeMap<Character, Integer> charList = new TreeMap<>();
        for(int i = 0; i < charArray.length; i++) {
           charList.put(charArray[i], (int)charArray[i]);
        }
        System.out.println(charList);


        // Convert HashMap to a List of Map.Entry
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(charList.entrySet());

        // Sort the list by values
        list.sort(Map.Entry.comparingByValue());

        // Create a LinkedHashMap to maintain the sorted order
        LinkedHashMap<Character, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Character, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        // Print the sorted map
        System.out.println(sortedMap);


    }
}

class OwnThread1 extends Thread {
    IncreamentCount increamentCount;

    public OwnThread1(IncreamentCount increamentCount) {
        this.increamentCount = increamentCount;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread 1: " + i);
           // increamentCount.increament();

        }
    }
}

class OwnThread2 extends Thread {
    IncreamentCount increamentCount;

    public OwnThread2(IncreamentCount increamentCount) {
        this.increamentCount = increamentCount;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread 2: " + i);
            //increamentCount.increament();
        }
    }
}
