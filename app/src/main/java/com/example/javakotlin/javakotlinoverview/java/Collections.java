package com.example.javakotlin.javakotlinoverview.java;

import java.util.*;

public class Collections {
    public static void main(String args[]) {

        ArrayList<String> days = new ArrayList<String>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");
        System.out.println(days);

        Map<Integer,String> employees = new HashMap<Integer,String>();
        employees.put(101,"Bansi");
        employees.put(102,"ABC");
        employees.put(103,"DEF");
        for(Map.Entry m:employees.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        LinkedList<String> names = new LinkedList<String>();
        names.add("abc");
        names.add("def");
        names.add("ghi");
        for(String i:names) {
            System.out.println(i);
        }
        names.remove(1);
        for(String i:names) {
            System.out.println(i);
        }
    }
}
