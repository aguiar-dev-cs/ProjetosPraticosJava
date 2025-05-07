package fundamentos;
// Faça um Programa que peça dois números e imprima a soma.

import java.util.Scanner;

public class Exer_Soma {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        int numero1 = scan.nextInt();

        System.out.println("Informe o segundo número: ");
        int numero2 = scan.nextInt();

        int resultado = numero1 + numero2;

        System.out.println("A soma dos número é: " + resultado);

     }
}
