package com.company;

import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        long x = 1, y = 0;

	    for (int i = 1; i <= 4; i++) {
            x *= (2*i+x*Math.pow(i,2));
        }

        for (int n = 3; n <= 10; n += 2) {
            y += (Math.pow(n,3))/(Math.pow(n,2)+1);
        }

        System.out.println(x);
	    System.out.println(y);
    }
}
