package fundamentos;

import java.util.Scanner;

public class Exer_VetorNumeros {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos números você deseja digitar? ");
        int numeros = scan.nextInt();

        double[] vetor = new double[numeros]; // Declaração do vetor de números reais

        // Leitura dos N números e armazenamento no vetor
        for (int i = 0; i < numeros; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = scan.nextDouble();
        }

        // Imprimir todos os elementos do vetor
        System.out.println("\nElementos do vetor:");
        for (int i = 0; i < numeros; i++) {
            System.out.println(vetor[i]);
        }

        // Calcular e mostrar a soma e a média dos elementos do vetor
        double soma = 0;
        for (int i = 0; i < numeros; i++) {
            soma += vetor[i];
        }

        double media = soma / numeros;

        System.out.println("\nSoma dos elementos: " + soma);
        System.out.println("Média dos elementos: " + media);

        scan.close();
    }
}
