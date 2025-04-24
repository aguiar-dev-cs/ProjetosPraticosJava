package fundamentos;

// Faça um Programa que peça 2 números inteiros e um número real.
// Calcule e mostre:
// a. o produto do dobro do primeiro com metade do segundo .
// b. a soma do triplo do primeiro com o terceiro.
// c. o terceiro elevado ao cubo.

import java.util.Scanner;

public class Exer11 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num1 = scan.nextInt();

        System.out.println("Digite outro número inteiro: ");
        int num2 = scan.nextInt();

        System.out.println("Digite um numero real: ");
        double num3 = scan.nextDouble();

        int resultado1 = (num1 * 2) * (num2 / 2);

        double resultado2 = (num1 * 3) + num3;

        double resultado3 = Math.pow (num3,3);

        System.out.println("O produto do dobro do primeiro com metade do segundo é " + resultado1);
        System.out.println("A soma do triplo do primeiro com o terceiro é " + resultado2);
        System.out.println("O terceiro elevado ao cubo " + resultado3);

    }
}
