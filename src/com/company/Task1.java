package com.company;

public class Task1 {

    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("gnirtS esreveR");
        str.reverse();

        System.out.println(str);


        String string = "1gnirtS esreveR";
        char[] chars = string.toCharArray();
        for (int i = chars.length-1; i >=0; i--) {

            System.out.print(chars[i]);
        }
    }
}
