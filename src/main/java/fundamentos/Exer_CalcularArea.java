package fundamentos;

//Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.

import java.util.Scanner;

public class Exer_CalcularArea {

    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        System.out.println("Didite o raio do círculo: ");
        double raio = ler.nextDouble();

        double area = Math.PI * Math.pow (raio, 2);
        ler.close();

        System.out.println("A área do círuclo com raio " + raio + " é " + area);

    }
}
