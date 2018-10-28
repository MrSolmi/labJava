package com.company;

import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int y = in.nextInt();

        if ((y >= -x+1) && (Math.pow(x,2)+Math.pow(y,2) <= 1)) {
            System.out.println("Попадает");
        }
        else {
            System.out.println("Не попадает");
        }
    }
}
