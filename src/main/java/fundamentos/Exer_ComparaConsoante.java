package fundamentos;

/* Faça um Programa que verifique se uma letra digitada é vogal ou
consoante. */

import java.util.Scanner;

public class Exer_ComparaConsoante {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digita uma letra;");
        String letra = scan.next();

        boolean comparaLetra = letra.length() != 1 || !Character.isLetter(letra.charAt(0));

        if (comparaLetra) {
            System.out.println("Não é uma letra válida");
        } else if (letra.equalsIgnoreCase("a") ||
                letra.equalsIgnoreCase("e") ||
                letra.equalsIgnoreCase("i") ||
                letra.equalsIgnoreCase("o") ||
                letra.equalsIgnoreCase("u")) {
            System.out.println("Vogal");
        } else {
            System.out.println("Consoante");
        }

        if (comparaLetra) {
            System.out.println("Não é uma letra válida");
        } else {
            switch (letra) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                case "A":
                case "E":
                case "I":
                case "O":
                case "U":
                    System.out.println("Vogal");
                    break;
                default:
                    System.out.println("Consoante");
            }
        }
        scan.close();
    }
}