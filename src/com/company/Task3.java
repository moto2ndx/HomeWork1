package com.company;

import java.util.Arrays;

public class Task3 {

    public static void main(String[] args) {

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 15);
        }
        System.out.println(Arrays.toString(numbers));


        int min = numbers[0];
        for (int a = 0; a < numbers.length; a++) {
            if (min > numbers[a]) {
                min = numbers[a];
            }
        }
        System.out.println(min);


        int max = numbers[0];
        for (int b = 0; b < numbers.length; b++) {
            if (max < numbers[b]) {
                max = numbers[b];
            }
        }
        System.out.println(max);


        double average = 0;
        for (int c = 0; c < numbers.length; c++) {
            average = average + numbers[c];
        }
        System.out.println(average / numbers.length);

    }
}
