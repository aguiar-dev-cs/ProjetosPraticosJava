package fundamentos;

/* Faça um Programa que leia três números e mostre-os em ordem
decrescente. */

import java.util.Arrays;
import java.util.Scanner;

public class Exer_OrdemDecrescente {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número:");
        int num1 = scan.nextInt();

        System.out.println("Digite um número:");
        int num2 = scan.nextInt();

        System.out.println("Digite um número:");
        int num3 = scan.nextInt();

        int numeros[] = {num1, num2, num3};
        Arrays.sort(numeros);

        System.out.println("Os números em ordem decrescente são:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        scan.close();
    }
}
