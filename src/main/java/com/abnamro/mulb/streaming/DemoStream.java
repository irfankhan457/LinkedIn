package com.abnamro.mulb.streaming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class DemoStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Consumer<Integer> printConsumer = System.out::println;

        numbers.forEach(printConsumer);
    }
}
