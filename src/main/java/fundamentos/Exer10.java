package fundamentos;

// Faça um Programa que peça a temperatura em graus Celsius,
//transforme e mostre em graus Farenheit.

import java.util.Scanner;

public class Exer10 {

    public static void main(String[] args){

        Scanner temp = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = temp.nextDouble();

        double fahrenheit = (celsius * 1.8) + 32;

        System.out.println("A temperatura em graus Fahrenheit é: " + fahrenheit);

    }
}
