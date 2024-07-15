package com.mericozkaya.methodsandclasses;

public class Musicians {
    //attribute
    String name;
    String instrument;
    int age;

    public Musicians(String name, String instrument, int age) {
        this.name = name;
        this.instrument = instrument;
        this.age = age;
        System.out.println("constructor called");
        //ilk name sınıfın attribute gösterirken diğer name oluşturulken verilen inputu gösteriyor
    }
}
