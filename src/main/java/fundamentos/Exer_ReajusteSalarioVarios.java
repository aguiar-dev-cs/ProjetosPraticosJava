package fundamentos;

/* As Organizações Tabajara resolveram dar um aumento de salário aos
seus colaboradores e lhe contraram para desenvolver o programa que
calculará os reajustes.
o Faça um programa que recebe o salário de mais de um colaborador e o
reajuste segundo o seguinte critério, baseado no salário atual:
o salários até R$ 280,00 (incluindo) : aumento de 20%
o salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
o salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
o salários de R$ 1500,00 em diante : aumento de 5% Após o
aumento ser realizado, informe na tela:
o o salário antes do reajuste;
o o percentual de aumento aplicado;
o o valor do aumento;
o o novo salário, após o aumento. */

import java.util.Scanner;

public class Exer_ReajusteSalarioVarios {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos funcionários deseja calcular? ");
        int totalFuncionarios = scan.nextInt();

        for (int i = 1; i <= totalFuncionarios; i++) {
            System.out.print("\nSalário do funcionário " + i + ": R$ ");
            double salario = scan.nextDouble();

            double percentual = (salario <= 280) ? 20 : (salario <= 700) ? 15 : (salario <= 1500) ? 10 : 5;

            double aumento = salario * percentual / 100;
            double novoSalario = salario + aumento;

            System.out.printf("Salário antes: R$ %.2f | Aumento: %.0f%% | Valor do aumento: R$ %.2f | Novo salário: R$ %.2f%n",
                    salario, percentual, aumento, novoSalario);
        }
        scan.close();
    }
}