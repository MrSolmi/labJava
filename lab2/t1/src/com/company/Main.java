package com.company;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Breed_of_dog> listBreed = new ArrayList<Breed_of_dog>();

        for (int i = 0; i < 3; i++) {
            listBreed.add(new Breed_of_dog());
        }

        System.out.printf("----------------------------------------------------------------------\n");
        System.out.printf("|                          Породы собак                              |\n");
        System.out.printf("----------------------------------------------------------------------\n");
        System.out.printf("|    Название    |  Группа  |    Обитание    | Численность популяции |\n");
        System.out.printf("----------------------------------------------------------------------\n");
        for (int i = 0; i < listBreed.size(); i++) {
        System.out.printf("| %14s | %8s | %14s | %21s |\n", listBreed.get(i).breed,
                                                          listBreed.get(i).group,
                                                          listBreed.get(i).livePlace,
                                                          listBreed.get(i).population);
        System.out.printf("----------------------------------------------------------------------\n");
        }
        System.out.printf("|      Группы: А - неагрессивные породы, Б - агрессивные породы      |\n");
        System.out.printf("----------------------------------------------------------------------\n");
    }
}
