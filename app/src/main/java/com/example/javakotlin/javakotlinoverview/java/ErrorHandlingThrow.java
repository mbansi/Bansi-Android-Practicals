package com.example.javakotlin.javakotlinoverview.java;

public class ErrorHandlingThrow {
    static void checkPassword(String password) {
        if (password.length() < 8) {
            throw new ArithmeticException("Password too short! Try again");
        }
        else {
            System.out.println("Access granted!");
        }
    }

    public static void main(String[] args) {
        checkPassword("bansi");
    }
}
