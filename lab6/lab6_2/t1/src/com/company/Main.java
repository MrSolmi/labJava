package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int value = in.nextInt();

        switch (value) {
            case 0:
                System.out.println("Ноль");
                break;
            case 1:
                System.out.println("Один");
                break;
            case 2:
                System.out.println("Два");
                break;
            case 3:
                System.out.println("Три");
                break;
            case 4:
                System.out.println("Четыре");
                break;
            case 5:
                System.out.println("Пять");
                break;
        }

        if (value == 0) {
            System.out.println("Ноль");
        }
        else if (value == 1) {
            System.out.println("Один");
        }
        else if (value == 2) {
            System.out.println("Два");
        }
        else if (value == 3) {
            System.out.println("Три");
        }
        else if (value == 4) {
            System.out.println("Четыре");
        }
        else if (value == 5) {
            System.out.println("Пять");
        }
    }
}
