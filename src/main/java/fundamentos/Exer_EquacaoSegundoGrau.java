package fundamentos;

/* Faça um programa que calcule as raízes de uma equação do segundo
grau, na forma ax2 + bx + c. O programa deverá pedir os valores de a,
b e c e fazer as consistências, informando ao usuário nas seguintes
situações:
a. Se o usuário informar o valor de A igual a zero, a equação não é
do segundo grau e o programa não deve fazer pedir os demais
valores, sendo encerrado;
b. Se o delta calculado for negativo, a equação não possui raizes
reais. Informe ao usuário e encerre o programa;
c. Se o delta calculado for igual a zero a equação possui apenas
uma raiz real; informe-a ao usuário;
d. Se o delta for positivo, a equação possui duas raiz reais;
informe-as ao usuário; */

import java.util.Scanner;

public class Exer_EquacaoSegundoGrau {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Calculadora de Raízes de Equação do Segundo Grau (ax² + bx + c) ---");

        System.out.print("Digite o valor de 'a': ");
        double a = scanner.nextDouble();

        // a. Se o usuário informar o valor de A igual a zero, a equação não é do segundo grau.
        if (a == 0) {
            System.out.println("O valor de 'a' não pode ser zero. Esta não é uma equação do segundo grau.");
            scanner.close();
            return; // Encerra o programa
        }

        System.out.print("Digite o valor de 'b': ");
        double b = scanner.nextDouble();

        System.out.print("Digite o valor de 'c': ");
        double c = scanner.nextDouble();

        // Calcula o delta
        double delta = (b * b) - (4 * a * c);

        System.out.println("\n--- Resultado ---");

        // b. Se o delta calculado for negativo, a equação não possui raízes reais.
        if (delta < 0) {
            System.out.println("O delta é negativo (" + delta + "). A equação não possui raízes reais.");
        }
        // c. Se o delta calculado for igual a zero a equação possui apenas uma raiz real.
        else if (delta == 0) {
            double raiz = -b / (2 * a);
            System.out.println("O delta é zero. A equação possui apenas uma raiz real:");
            System.out.println("Raiz única: " + raiz);
        }
        // d. Se o delta for positivo, a equação possui duas raízes reais.
        else {
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("O delta é positivo (" + delta + "). A equação possui duas raízes reais:");
            System.out.println("Raiz 1: " + raiz1);
            System.out.println("Raiz 2: " + raiz2);
        }
        scanner.close();
    }
}
