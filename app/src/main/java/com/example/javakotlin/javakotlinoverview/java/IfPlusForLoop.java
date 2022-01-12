package com.example.javakotlin.javakotlinoverview.java;

public class IfPlusForLoop {
    public static void main(String args[]) {
        int i;
        for(i=0;i<10;i++) {
            if(i%2 == 0) {
                System.out.println(i + " divisible by 2");
            }
            else {
                continue;
            }
        }
    }
}
