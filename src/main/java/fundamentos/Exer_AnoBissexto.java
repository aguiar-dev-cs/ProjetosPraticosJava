package fundamentos;

/* Faça um Programa que peça um número correspondente a um
determinado ano e em seguida informe se este ano é ou não bissexto. */

import java.util.Scanner;

public class Exer_AnoBissexto {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o ano para saber se é bissexto: ");
        int ano = scan.nextInt();

        if ((ano % 400 == 0) ||(ano % 4 == 0 && ano % 100 != 0)) {
            System.out.println(ano + " é um ano Bissexto!");
        } else {
            System.out.println(ano + " não é um ano Bissexto!");
        }
        scan.close();
    }
}
