package com.company;

public class Main {

    public static void main(String[] args) {
        MyType withoutСonstructor = new MyType();
        MyType withConstructor = new MyType(54);

        withoutСonstructor.myMethod();
        withConstructor.myMethod();
    }
}
