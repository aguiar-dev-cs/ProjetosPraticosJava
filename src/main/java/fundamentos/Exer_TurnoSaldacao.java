package fundamentos;

/* Faça um Programa que pergunte em que turno você estuda. Peça
para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a
mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor
Inválido!", conforme o caso. */

import java.util.Scanner;

public class Exer_TurnoSaldacao {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual turno você estuda: M-matutino, V-vespertino, N-noturno:");
        String turno = scan.next();

        boolean comparaEntrada = turno.length() != 1 || !Character.isLetter(turno.charAt(0));


        if (comparaEntrada) {
            System.out.println("Não é uma informação válida");
        } else if (turno.equalsIgnoreCase("m")) {
            System.out.println("Bom Dia!");
        } else if (turno.equalsIgnoreCase("v")) {
            System.out.println("Boa Tarde!");
        } else if (turno.equalsIgnoreCase("n")) {
            System.out.println("Boa noite!");
        }
        scan.close();
    }
}