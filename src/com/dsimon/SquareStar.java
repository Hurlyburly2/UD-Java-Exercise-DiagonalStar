package com.dsimon;

public class SquareStar {
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 1; i <= number; i++) {
                String currentRow = "";
                for (int j = 1; j <= number; j++) {
                    if (i == 1 || i == number || j == 1 || j == number || i == j || j == (number - i + 1)) {
                        currentRow += "*";
                    } else {
                        currentRow += " ";
                    }
                }
                System.out.println(currentRow);
            }
        }
    }
}
