package fundamentos;
//Faça um Programa que peça as 4 notas bimestrais e mostre a média.

import java.util.Scanner;

public class Exer04 {

    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe sua primeira nota: ");
        double nota1 = scan.nextDouble();

        System.out.println("Informe sua segunda nota: ");
        double nota2 = scan.nextDouble();

        System.out.println("Informe sua terceira nota: ");
        double nota3 = scan.nextDouble();

        System.out.println("Informe sua quarta nota: ");
        double nota4 = scan.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Sua média é: " + media);

    }
}
