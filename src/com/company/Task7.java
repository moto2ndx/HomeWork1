package com.company;

public class Task7 {

    public static void main(String[] args) {

        String word = "Abstract";
        char letter = 'A';
        boolean isExists = false;

        char[] chars = word.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == letter) {
                isExists = true;

            }
        }
        System.out.println(isExists);
    }
}
