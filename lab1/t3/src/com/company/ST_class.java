package com.company;

public class ST_class {
    static public void ST () {
        short s = 1024;
        int i = 50000;
        float f = 5.6F;
        double d = .1234;
        byte b = 42;
        char c = 'a';
        Object result = (f*b)+(i/c)-(d*s);

        if (result instanceof Short) {
            System.out.printf("Short\n");
        }
        else if (result instanceof Integer) {
            System.out.printf("Integer\n");
        }
        else if (result instanceof Float) {
            System.out.printf("Float\n");
        }
        else if (result instanceof Double) {
            System.out.printf("Double\n");
        }
        else if (result instanceof Byte) {
            System.out.printf("Byte\n");
        }
        else if (result instanceof Character) {
            System.out.printf("Char\n");
        }

        System.out.print(result);
    }
}
