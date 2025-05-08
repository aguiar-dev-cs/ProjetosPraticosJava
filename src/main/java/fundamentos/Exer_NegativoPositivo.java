package fundamentos;

/*
Faça um Programa que peça um valor e mostre na tela se o valor é
positivo ou negativo.
*/

import java.util.Scanner;

public class Exer_NegativoPositivo {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Digite um número:");
        int num = reader.nextInt();

        if (num >= 0) {
            System.out.println(num + " é positivo.");
        } else {
            System.out.println(num + " é negativo.");
        }
    }
}