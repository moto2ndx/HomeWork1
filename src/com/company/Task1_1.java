package com.company;

public class Task1_1 {

    public static void main(String[] args) {

        TwoWords twoWords1 = new TwoWords();
        twoWords1.name = "gnirts esreveR";
        twoWords1.reverse();
    }
}

class TwoWords {
    String name;

    void reverse() {
        char[] chars = name.toCharArray();
        for (int i = chars.length-1; i >= 0; i--) {

            System.out.print(chars[i]);
        }

    }
}