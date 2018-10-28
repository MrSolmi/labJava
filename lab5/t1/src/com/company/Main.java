package com.company;

public class Main {

    public static void main(String[] args) {
	    int someInt = 54;
	    SomeObject someObject = new SomeObject(54);
	    int[] someMass = {1, 2, 3, 4, 5};

        MyMethods.MyMethod1(someInt);
        MyMethods.MyMethod2(someObject);
        MyMethods.MyMethod3(someMass[1]);

        System.out.println(someInt);
        System.out.println(someObject.someArg);
        System.out.println(someMass[1]);
    }
}
