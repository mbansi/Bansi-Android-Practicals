package com.example.javakotlin.javakotlinoverview.java;

class Person {
    String name;
    int age;
}

class Student extends Person {
    String course;
    float fees;
}

class WorkingMan extends Person {
    String occupation;
    float income;
}

public class Inheritance {
    public static void main(String args[]) {
        Student s = new Student();
        s.name = "Bansi";
        s.course = "BTech";

        WorkingMan w = new WorkingMan();
        w.name = "ABC";
        w.occupation = "Professor";

        System.out.println("--Student--");
        System.out.println("name: " + s.name);
        System.out.println("course: " + s.course);

        System.out.println("--WorkingMan--");
        System.out.println("name: " + w.name);
        System.out.println("occupation: " + w.occupation);
    }
}
