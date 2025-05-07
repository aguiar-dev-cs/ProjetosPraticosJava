package fundamentos;

/* Faça um Programa que pergunte quanto você ganha por hora e o
número de horas trabalhadas no mês. Calcule e mostre o total do seu
salário no referido mês, sabendo-se que são descontados 11% para o
Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um
programa que nos dê:
. salário bruto.
a. quanto pagou ao INSS.
b. quanto pagou ao sindicato.
c. o salário líquido.
d. calcule os descontos e o salário líquido, conforme a tabela
abaixo:
+ Salário Bruto : R$ - IR (11%) : R$ - INSS
(8%) : R$ - Sindicato ( 5%) : R$ = Salário
Liquido : R$
Obs.: Salário Bruto - Descontos = Salário Líquido.*/

import java.util.Scanner;

public class Exer_SalarioDescontos {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora: ");
        double valorHora = scan.nextDouble();

        System.out.println("Quantas horas você trabalha por dia: ");
        double horasTrabalho = scan.nextDouble();

        System.out.println("Você trabalhou quantos dias este mês: ");
        double diasMes = scan.nextDouble();

        double horasMes = (diasMes * horasTrabalho);

        double salarioBruto = (horasMes * valorHora);
        double inss = (salarioBruto / 100) * 8;
        double sindicato = (salarioBruto / 100) * 5;
        double ir = (salarioBruto / 100) * 11;
        double totalDescontos = inss + sindicato + ir;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Salarário Bruto: "  + salarioBruto);
        System.out.println("Inss: " + inss);
        System.out.println("Sindicato: " + sindicato);
        System.out.println("Imposto sobre Renda: " + ir);
        System.out.println("Total de Descontos: " + totalDescontos);
        System.out.println("Salário Liquido: " + salarioLiquido);

    }


}
