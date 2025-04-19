package com.abnamro.mulb.stream.Abstract;

public class InnerClass {
    int age;
    public void show() {
        System.out.println("Hello from InnerClass");
    }
    static class Inner {
        public void show() {
            System.out.println("Hello from InnerClass.Inner");
        }
    }

    public static void main(String[] args) {
        InnerClass outer = new InnerClass();
        outer.show(); // Calls the method of Outer class
        InnerClass.Inner inner = new Inner();
        inner.show(); // Calls the method of Inner class
    }
}
