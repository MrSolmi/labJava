package com.company;

public class MyType {
    public int myData = 0;

    public MyType () {
        System.out.print("\nКонструктор без параметров");
    }

    public MyType (int V) {
        System.out.print("\nКонструктор с одним параметром V");
        myData = V;
    }

    public void myMethod() {
        System.out.printf("\nmyMethod! %s", myData);
    }
}
