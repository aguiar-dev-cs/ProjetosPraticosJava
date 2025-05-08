package fundamentos;

/* Faça um Programa que verifique se uma letra digitada é "F" ou "M".
Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido. */

import java.util.Scanner;

public class Exer_ComparaLetra {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Digita uma letra F ou M;");
        String input = reader.next();

        if (input.equalsIgnoreCase("f")) {
            System.out.println("F - feminino");
        } else if (input.equalsIgnoreCase("m")) {
            System.out.println("M - masculino");
        } else {
            System.out.println("Letra inválida");
        }
    }
}