package com.company;

public class Task1_1 {

    public static void main(String[] args) {

        String string = "eulaVgnirtS";

        String s = reverseString(string);

        System.out.println(s);

    }

    public static String reverseString(String string) {

        char[] chars = string.toCharArray();

        char[] finalChars = new char[chars.length];

        int counter = 0;
        for (int i = chars.length - 1; i >= 0; i--) {

            finalChars[counter] = chars[i];
            counter++;
        }

        return String.valueOf(finalChars);
    }
}


