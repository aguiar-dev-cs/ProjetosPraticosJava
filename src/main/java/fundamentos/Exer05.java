package fundamentos;

import java.util.Scanner;

//Faça um Programa que converta metros para centímetros.

public class Exer05 {

    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o tamanho em metros para conversão em centímetro: ");
        double metros = ler.nextDouble();
        double centimetros = metros * 100;
        ler.close();

        System.out.println(metros + " metros convertidos em centímetros é " + centimetros + ( " centímtros."));

    }
}
