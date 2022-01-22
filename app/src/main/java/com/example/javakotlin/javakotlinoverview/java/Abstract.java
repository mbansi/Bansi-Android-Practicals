package com.example.javakotlin.javakotlinoverview.java;

abstract class Abstract {
    public void myMethod(){
        System.out.println("Hello");
    }
    abstract public void anotherMethod();
}

class Demo extends Abstract {
    public void anotherMethod() {
        System.out.print("Abstract method");
    }
    public static void main(String args[]) {
        Demo d = new Demo();
        d.myMethod();
        d.anotherMethod();
    }
}
