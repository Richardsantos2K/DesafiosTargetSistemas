package org.example;

import java.util.Scanner;

public class desafio2VerificarString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();

        int count = contarA(input);

        if (count > 0) {
            System.out.println("A letra 'a' aparece " + count + " vezes na string.");
        } else {
            System.out.println("A letra 'a' não aparece na string.");
        }

        scanner.close();
    }

    public static int contarA(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'A') {
                count++;
            }
        }
        return count;
    }
}
