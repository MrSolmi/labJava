package com.company;

import java.util.Scanner;

public class Breed_of_dog {
    String breed;
    String group;
    String livePlace;
    String population;

    Scanner in = new Scanner(System.in);

    public Breed_of_dog () {
        breed = in.nextLine();
        group = in.nextLine();
        livePlace = in.nextLine();
        population = in.nextLine();
    }
}
