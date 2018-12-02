package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String currentCity;

        ArrayList<String> citiesList = new ArrayList<>();
        citiesList.add("Винница");
        citiesList.add("Киров");
        citiesList.add("Киев");
        citiesList.add("Покровск");
        citiesList.add("Алушта");
        citiesList.add("Артёмовск");

        System.out.print("Введите стартовое слово: ");
        currentCity = in.nextLine();
        citiesList.add(currentCity);

        while (currentCity != null) {
            System.out.println(currentCity);
            currentCity = wordSearch(citiesList, currentCity);
        }
    }

    public static String firstSymbolSearch(String word) {
        return word.substring(0, 1);
    }

    public static String lastSymbolSearch(String word) {
        return word.substring(word.length()-1);
    }

    public static String wordSearch(ArrayList<String> listCity, String currentCity) {
        for (String city:
             listCity) {
            if (lastSymbolSearch(currentCity).equalsIgnoreCase(firstSymbolSearch(city))) {
                listCity.remove(city);
                return city;
            }
        }
        return null;
    }
}
