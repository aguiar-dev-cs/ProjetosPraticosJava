package fundamentos;

// Faça um Programa que peça dois números e imprima o maior deles.

import java.util.Scanner;

public class Exer_NumeroMaior {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Digite um número:");
        int num1 = reader.nextInt();

        System.out.println("Digite outro número:");
        int num2 = reader.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " é maior que " + num2);
        } else {
            System.out.println(num2 + " é maior que " + num1);
        }
    }
}