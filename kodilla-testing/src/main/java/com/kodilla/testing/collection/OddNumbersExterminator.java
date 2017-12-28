package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {

    public static ArrayList<Integer> exterminate(ArrayList<Integer> numbers, ArrayList<Integer> evenNumbers) {
        for (Integer tempNumber : numbers){
            if ((tempNumber % 2) == 0){
                evenNumbers.add(tempNumber);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        Random theGenerator = new Random();

        int numberSize = 10;

        for (int i = 0; i < numberSize; i++) {
            numbers.add(theGenerator.nextInt(100));
        }
        exterminate(ArrayList<Integer> numbers);
        System.out.println(evenNumbers.size());
    }
}