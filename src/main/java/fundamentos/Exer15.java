package fundamentos;

/*Faça um programa que peça o tamanho de um arquivo para download
(em MB) e a velocidade de um link de Internet (em Mbps), calcule e
informe o tempo aproximado de download do arquivo usando este link
(em minutos).*/

import java.util.Scanner;

public class Exer15 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Tamanho do arquivo:");
        double arquivo = scan.nextDouble();

        System.out.println("Velocidade da internet:");
        double velocidade = scan.nextDouble();

        double tempo = arquivo / velocidade;

        System.out.println("O tempo aproximado de download é " + tempo);


    }
}
