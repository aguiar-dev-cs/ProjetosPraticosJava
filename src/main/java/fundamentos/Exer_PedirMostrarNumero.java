package fundamentos;
// Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].

import java.util.Scanner;

public class Exer_PedirMostrarNumero {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scan.nextInt();

        System.out.println("O numero informado foi: " + numero);

    }
}