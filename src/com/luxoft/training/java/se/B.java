package com.luxoft.training.java.se;

public class B extends A {
    public String m2() {
        return "А я - метод №2";
    }

    public static void main(String... args) {
        B b = new B();
        A a = new B();

        System.out.println("b.m2() = " + b.m2());
        System.out.println("b.m1() = " + b.m1());
        System.out.println("a.m1() = " + a.m1());
//        System.out.println("a.m2() = " + a.m2());
        System.out.println("((B) a).m2() = " + ((B) a).m2());

        System.out.println("a.hashCode() = " + a.hashCode());
    }
}
