package com.company;

import java.util.Scanner;

public class MyMethod {
    public static double powMethod (double _value) throws Exception {
        if (_value > 0) {
            return  Math.pow(_value,2);
        }
        else {
            throw new Exception("Число должно быть > 0");
        }
    }
}
