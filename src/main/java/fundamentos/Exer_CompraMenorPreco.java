package fundamentos;

/* Faça um Programa peça o valor de tres produtos e opte pela compra do mais barato. */

import java.util.Scanner;

public class Exer_CompraMenorPreco {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor do primeiro produto:");
        double valor1 = scan.nextDouble();

        System.out.println("Digite o valor do segundo produto:");
        double valor2 = scan.nextDouble();

        System.out.println("Digite o valor do terceiro produto:");
        double valor3 = scan.nextDouble();

        double barato = valor1;
        double caro = valor1;

        if (valor2 > caro) {
            caro = valor2;
        }
        if (valor2 < barato) {
            barato = valor2;
        }
        if (valor3 > caro) {
            caro = valor3;
        }
        if (valor3 < barato) {
            barato = valor3;
        }
        System.out.println("O produto mais caro vale " + caro + " e o produto mais barato vale " + barato);

        scan.close();
    }
}