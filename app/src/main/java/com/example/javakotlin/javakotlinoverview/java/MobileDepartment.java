package com.example.javakotlin.javakotlinoverview.java;

interface MobileDepartment {
    void getIDE(String ide);
}

class Bansi implements MobileDepartment {

    public void getIDE(String ide) {
        System.out.println("Bansi is working in " + ide);
    }
}

class ABC implements MobileDepartment {
    public void getIDE(String ide) {
        System.out.println("ABC is working in " + ide);
    }
}

class InterfaceDemo {
    public static void main(String[] args) {
        Bansi b = new Bansi();
        b.getIDE("Android Studio");

        ABC abc = new ABC();
        abc.getIDE("XCode");
    }
}
