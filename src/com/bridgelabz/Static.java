package com.bridgelabz;

public class Static {
    static int x = 10;
    static int y;

    static void func(int z) {
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }

    static {
        System.out.println("Running static initialization block 1.");
        y = x + 5;
        System.out.println(y);
    }
    static {
        System.out.println("Running static initialization block 2.");
        y=35;
        System.out.println(y);
    }

    public static void main(String args[]) {
        func(10);
    }
}