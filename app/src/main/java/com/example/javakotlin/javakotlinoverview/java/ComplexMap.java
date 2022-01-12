package com.example.javakotlin.javakotlinoverview.java;

import java.util.ArrayList;
import java.util.HashMap;

public class ComplexMap {
    public static void main(String []args) {

        ArrayList<String> names = new ArrayList<String>();
        names.add("abc");
        names.add("def");
        names.add("ghi");

        ArrayList<String> branch = new ArrayList<String>();
        branch.add("CE");
        branch.add("EC");
        branch.add("ME");

        HashMap<String, ArrayList<String>> map = new HashMap<String,ArrayList<String>>();
        map.put("Names", names);
        map.put("Branch", branch);

        for (String name : map.keySet()) {
            ArrayList<String> n = map.get(name);
            System.out.println("Key = " + name + ", Value = " + n);
        }
    }
}
