package com.abnamro.mulb.optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class demo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Irfan", "Ali", "Ahmed");
        Optional<String> name = names.stream()
                .filter(s -> s.startsWith("I"))
                .findFirst();
        System.out.println(name.orElse("No name found"));
    }
}
