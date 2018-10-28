package com.company;

public class Main {

    public static void main(String[] args) {
        int nextNum = 1, sum = 0;

        for (int i = 0, x = 0, y = 1; i < 10; i++) {
            sum += nextNum;
            nextNum = x+y;
            x = y;
            y = nextNum;
        }

        System.out.println(sum);
    }
}
