package com.abnamro.mulb.parllelStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        int size = 10_000;
        List<Integer> nums = new ArrayList<>(size);

        Random random = new Random();
        for(int i = 0; i < size; i++) {
            nums.add(random.nextInt(100));
        }
//        long startSeqRed = System.currentTimeMillis();
//        int sum1 = nums.stream()
//                .map(i -> i * 2)
//                .reduce(0, (c,e) -> c + e);
//        long endSeqRed = System.currentTimeMillis();
        long startSeqParStream = System.currentTimeMillis();
        int sum3 = nums.parallelStream()
                .map(i -> {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return i * 2;
                })
                .mapToInt(i->i)
                .sum();
        long endSeqParStream = System.currentTimeMillis();
        long startSeqStream = System.currentTimeMillis();
        int sum2 = nums.stream()
                .map(i -> {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return i * 2;
                })
                .mapToInt(i->i)
                .sum();
        long endSeqStream = System.currentTimeMillis();

        System.out.println(" sum2 = " + sum2 + " sum3 = " + sum3);

       // System.out.println("Sequential stream took " + (endSeqRed - startSeqRed) + " ms");
        System.out.println("Sequential stream took " + (endSeqStream - startSeqStream) + " ms");
        System.out.println("Parallel stream took " + (endSeqParStream - startSeqParStream) + " ms");
    }
}
