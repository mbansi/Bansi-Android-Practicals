package com.example.javakotlin.javakotlinoverview.java;

import java.util.*;

public class OperatorsWithSwitchCase {
    public static void main(String []args) {
        int a=15;
        int b=5;
        int c;

        System.out.println("Enter your choice of operation:");
        System.out.println("1.Add");
        System.out.println("2.Subtract");
        System.out.println("3.Multiply");
        System.out.println("4.Divide");
        System.out.println("5.Modulus");
        System.out.println("6.Increment");
        System.out.println("7.Decrement");
        System.out.println("8.Equal to");
        System.out.println("9.Not equal to");
        System.out.println("10.Greater than");
        System.out.println("11.Bitwise and");
        System.out.println("12.Bitwise or");
        System.out.println("13.Bitwise Xor");
        System.out.println("14.Complement");
        System.out.println("15.Left shift");
        System.out.println("16.Right Shift");

        Scanner sc = new Scanner(System.in);
        c=sc.nextInt();

        switch(c) {
            case 1 :
                System.out.println("Addition =" + (a+b));
                break;
            case 2 :
                System.out.println("Subtraction =" + (a-b));
                break;
            case 3 :
                System.out.println("Multiplication =" + (a*b));
                break;
            case 4 :
                System.out.println("Division =" + (a/b));
                break;
            case 5 :
                System.out.println("Modulus =" + (b%a));
                break;
            case 6 :
                System.out.println("Increment a =" + a++);
                System.out.println("Increment b =" + b++);
                break;
            case 7 :
                System.out.println("Decrement a =" + a--);
                System.out.println("Decrement b =" + b--);
                break;
            case 8 :
                System.out.println("Equals:" + (a == b));
                break;
            case 9 :
                System.out.println("Not Equals:" + (a!=b));
                break;
            case 10 :
                System.out.println("Greater than:" + (a>=b));
                break;
            case 11 :
                System.out.println("Bitwise and result:" + (a&b));
                break;
            case 12 :
                System.out.println("Bitwise or result:" + (a|b));
                break;
            case 13 :
                System.out.println("Bitwise Xor result:" + (a^b));
                break;
            case 14 :
                System.out.println("Complement a:" + ~a);
                System.out.println("Complement b:" + ~b);
                break;
            case 15 :
                System.out.println("Left shift a:" + (a << 2));
                break;
            case 16 :
                System.out.println("Right shift a:" + (a>>2));
                break;
            default :
                System.out.println("invalid choice");
                break;
        }
    }
}
