package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();

        System.out.println( x > y ? (x > z ? x : z) : (y > z ? y : z));
    }
}
