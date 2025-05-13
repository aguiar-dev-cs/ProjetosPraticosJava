package fundamentos;

/* Faça um Programa que leia três números e mostre o maior e menor deles. */

import java.util.Scanner;

public class Exer_NumeroMaiorMenor {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int num1 = scan.nextInt();

        System.out.println("Digite o segundo número:");
        int num2 = scan.nextInt();

        System.out.println("Digite o terceiro número:");
        int num3 = scan.nextInt();

        System.out.println("Você informou " + num1 + ", " + num2 + ", " + num3 + ".");

        int maior = num1;
        int menor = num1;

        if (num2 > maior) {
            maior = num2;
        }
        if (num2 < menor) {
            menor = num2;
        }
        if (num3 > maior) {
            maior = num3;
        }
        if (num3 < menor) {
            menor = num3;
        }
        System.out.println("O número maior é " + maior + " e o número menor é " + menor);

        scan.close();
    }
}