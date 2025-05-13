package fundamentos;

/* Faça um programa para a leitura de duas notas parciais de um aluno.
O programa deve calcular a média alcançada por aluno e apresentar:
A mensagem "Aprovado", se a média alcançada for maior ou
igual a sete; A mensagem "Reprovado", se a média for menor do que sete;
A mensagem "Aprovado com Distinção", se a média for igual a
dez. */

import java.util.Scanner;

public class Exer_MediaNota {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a nota 1:");
        double nota1 = scan.nextDouble();

        System.out.println("Informe a nota 2:");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;
        System.out.println("Média: " + media);
        int resultado;

        if (media == 10) {
            System.out.println("Aprovado com distinção");
            resultado = 3;
        } else if (media >= 7) {
            System.out.println("Aprovado");
            resultado = 2;
        } else {
            System.out.println("Reprovado");
            resultado = 1;
        }
        switch (resultado) {
            case 1:
                System.out.println("Reprovado");
                break;
            case 2:
                System.out.println("Aprovado");
                break;
            case 3:
                System.out.println("Aprovado com distinção");
                break;
            default:
                System.out.println("Entrada inválida");
        }
        scan.close();
    }
}
