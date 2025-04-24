package com.abnamro.mulb.methodreferance;

import java.util.Arrays;
import java.util.List;

public class demo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Irfan", "Ali", "Ahmed");
        List<String> names2 = names.stream()
                .map(String::toUpperCase)
                .toList();
        names2.forEach(System.out::println);
    }
}
