package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

	    try {
	        System.out.println(MyMethod.powMethod(in.nextInt()));
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
