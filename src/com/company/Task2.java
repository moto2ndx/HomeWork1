package com.company;

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {

        int numbers [] = new int[15];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10);

        }
        System.out.println(Arrays.toString(numbers));

        int box;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length-1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    box = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = box;

                }
            }
        }
        System.out.println(Arrays.toString(numbers));

        for (int x = numbers.length-1; x >= 0; x--) {

            System.out.print(numbers[x]);

        }
    }
}
