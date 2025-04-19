package com.abnamro.mulb.stream.functional;

@FunctionalInterface
interface A {
    int show(int a, int b);
}
public class FuncationalInter {
    public static void main(String[] args) {
        A a = Integer::sum;
       System.out.println(a.show(100, 200));

        A obj = new A() {
            @Override
            public int show(int a, int b) {
                int d =a+b;
                return d;
            }
        };
        System.out.println(obj.show(100, 200));
    }
}
