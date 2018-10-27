package com.company;

import java.util.Scanner;

public class Employee extends Person {
    String companyName;
    Scanner in = new Scanner(System.in);

    public Employee() {
        companyName = in.nextLine();
    }

    void displayInfo() {
        super.displayInfo();
        System.out.printf("\n%s", companyName);
    }
}
