package com.example.javakotlin.javakotlinoverview.java;

enum Department {
    IT, SALES, MARKETING, FINANCE
}

public class Enumeration {
    public static void main(String args[]) {
        Department dept;
        dept = Department.MARKETING;
        System.out.println("This is "+dept+ " team.");
    }
}
