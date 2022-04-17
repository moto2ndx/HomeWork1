package com.company;

public class Task6 {

    public static void main(String[] args) {

        String string = "блефовавший, блекнул, блевотный, блесна, бледно-зеленый, блестящий, блевать, блекнущий, блещу, блефарит";
        String subString = "бле";

        char[] charSubString = subString.toCharArray();
        char[] charString = string.toCharArray();
        boolean isContain = false;
        int countMatches = 0;

        for (int i = 0; i < charString.length; i++) {

            if (charString[i] == charSubString[0]) {
                int counter = i + 1;

                int matchLetters = 1;

                for (int j = 1; j < charSubString.length; j++) {

                    if (charString[counter] == charSubString[j]) {
                        counter++;
                        matchLetters++;

                    } else {
                        break;
                    }
                }

                if (matchLetters == charSubString.length) {
                    isContain = true;
                    countMatches++;
                }

            }

        }

        System.out.println(countMatches + " " + isContain);
    }
}
