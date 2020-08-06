package com.codewithmosh.MainMethodTesting;

public class B {
    public static void main(String[] args) {
        System.out.println("printing B");
        var a = new A();
        a.main(args);
        System.out.println(args);
    }

}
