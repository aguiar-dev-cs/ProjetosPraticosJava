package fundamentos;

//Faça um Programa que pergunte quanto você ganha por hora e o
//número de horas trabalhadas no mês. Calcule e mostre o total do seu
//salário no referido mês.

import java.util.Scanner;

public class Exer_Salario {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora: ");
        double valorHora = scan.nextDouble();

        System.out.println("Quantas horas você trabalha por dia: ");
        double horasTrabalho = scan.nextDouble();

        System.out.println("Você trabalhou quantos dias este mês: ");
        double diasMes = scan.nextDouble();

        double horasMes = (diasMes * horasTrabalho);

        double salario = (horasMes * valorHora);

        System.out.println("Você trabalhou " + horasMes + " horas nesse mês e vai receber um salário de " + salario + " reais.");


    }
}
