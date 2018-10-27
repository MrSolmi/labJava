package com.company;

import java.util.Scanner;

public class Person {
    private String name;
    private String surname;
    Scanner in = new Scanner(System.in);

    public Person() {
        name = in.nextLine();
        surname = in.nextLine();
    }

    void displayInfo() {
        System.out.printf("\n%s\n%s", name, surname);
    }
}
