package fundamentos;

//Faça um Programa que peça a temperatura em graus Farenheit,
//transforme e mostre a temperatura em graus Celsius.
//C = (5 * (F-32) / 9).

import java.util.Scanner;

public class Exer09 {

    public static void main(String[] args){

        Scanner temp = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        double fahrenheit = temp.nextDouble();

        double celsius = (5 * (fahrenheit - 32)) / 9;

        System.out.println("A temperatura em graus Celsius é: " + celsius);

    }
}
