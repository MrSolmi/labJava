package com.company;

import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        double a = 12.5, b = 1.3, c = 14.1, x = 3.3;
        System.out.println(
                (1/(2*a*b)) * Math.log((Math.sqrt(Math.pow(c,2)-Math.pow(b,2))*Math.tan(a*x)+2) / (Math.sqrt(Math.pow(c,2)-Math.pow(b,2))*Math.tan(a*x)-2))
        );


    }
}