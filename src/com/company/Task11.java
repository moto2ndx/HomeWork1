package com.company;

public class Task11 {

    public static void main(String[] args) {

        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || i == n || j == n)
                    System.out.print(" 8 ");
                else
                    System.out.print(" * ");
            }
            System.out.println();
        }
    }
}