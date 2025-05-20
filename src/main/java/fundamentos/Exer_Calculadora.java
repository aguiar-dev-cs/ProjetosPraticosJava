package fundamentos;

import java.util.InputMismatchException; // Para tratar erros de entrada
import java.util.Scanner; // Para ler a entrada do usuário

public class Exer_Calculadora {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            double num1;
            double num2;
            char operador;
            double resultado;

            System.out.println("---- Calculadora Simples em Java ----");
            System.out.print("Digite o primeiro número: ");
            num1 = scan.nextDouble();

            System.out.print("Escolha a operação (+, -, *, /): ");
            operador = scan.next().charAt(0); // Pega o primeiro caractere da entrada

            System.out.print("Digite o segundo número: ");
            num2 = scan.nextDouble();

            switch (operador) {
                case '+':
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + num1 + " + " + num2 + " = " + resultado);
                    break;
                case '-':
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + num1 + " - " + num2 + " = " + resultado);
                    break;
                case '*':
                    resultado = num1 * num2;
                    System.out.println("Resultado: " + num1 + " * " + num2 + " = " + resultado);
                    break;
                case '/':
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("Resultado: " + num1 + " / " + num2 + " = " + resultado);
                    } else {
                        System.out.println("Erro: Não é possível dividir por zero!");
                    }
                    break;
                default:
                    System.out.println("Operador inválido! Use +, -, * ou /.");
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, digite apenas números para os valores.");
        }
    }
}