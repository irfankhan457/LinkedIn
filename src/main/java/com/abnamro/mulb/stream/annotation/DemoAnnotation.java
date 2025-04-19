package com.abnamro.mulb.stream.annotation;



class A {
    public void methods() {
        System.out.println("Method A");
    }
}
class B extends A {
    @Override
    public void methods() {
        System.out.println("Method B");
    }
}
public class DemoAnnotation {
    public static void main(String[] args) {
        A a = new A();
        a.methods(); // prints "Method A"

        B b = new B();
        b.methods(); // prints "Method B"

        A ab = new B();
        ab.methods(); // prints "Method B"
    }


}


