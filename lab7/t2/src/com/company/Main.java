package com.company;

public class Main {

    public static void main(String[] args) {
        Thread first = new Thread(new ThreadMethod(750), "firstThread");
        Thread second = new Thread(new ThreadMethod(1250), "secondThread");

        first.start();
        second.start();
    }
}
