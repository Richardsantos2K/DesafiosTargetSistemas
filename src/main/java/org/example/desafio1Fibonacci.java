package org.example;

import java.util.Scanner;

public class desafio1Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int number = scanner.nextInt();

        if (isFibonacci(number)) {
            System.out.println("O número " + number + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + number + " NÃO pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }

    public static boolean isFibonacci(int num) {
        int a = 0, b = 1, c = 0;
        while (c < num) {
            c = a + b;
            a = b;
            b = c;
        }
        return num == c || num == 0;
    }


}
