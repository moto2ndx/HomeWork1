package com.company;

public class Task5 {

    public static void main(String[] args) {

        int[] numbers = {9, -1, -4, 5, 5, -7, 8, -3, 6, -2};

        OperationArray operationArray = new OperationArray();

        int sum = operationArray.sumAllNumbers(numbers);
        System.out.println("Sum all the numbers: " + sum);

        int sumPlus = operationArray.sumPlusNumbers(numbers);
        System.out.println("Sum plus numbers: " + sumPlus);

        int sumMinus = operationArray.sumMinusNumbers(numbers);
        System.out.println("Sum minus numbers: " + sumMinus);
    }
}

class OperationArray {

    public int sumAllNumbers(int[] numbers) {

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {

            sum = sum + numbers[i];

        }
        return sum;
    }

    public int sumPlusNumbers(int[] numbers) {

        int sumPlus = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {

                sumPlus = sumPlus + numbers[i];
            }

        }
        return sumPlus;
    }

    public int sumMinusNumbers(int[] numbers) {

        int sumMinus = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] < 0) {

                sumMinus = sumMinus + numbers[i];
            }
        }
        return sumMinus;
    }
}





