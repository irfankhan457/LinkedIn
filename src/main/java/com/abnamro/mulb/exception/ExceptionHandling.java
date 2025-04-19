package com.abnamro.mulb.exception;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ExceptionHandling {

    public static void main(String[] args) {
        String str ="hello world";

        Map<Character, Long> charCountMap = new HashMap<>();
        IntStream intStream = str.chars();
        Stream<Character> stream = intStream.mapToObj(c-> (char) c);
        charCountMap = stream.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        charCountMap.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
