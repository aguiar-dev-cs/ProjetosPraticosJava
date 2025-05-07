package Desafios;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int entrada = leitor.nextInt();

        String resultado = limiteVelocidade(entrada);
        System.out.println(resultado);

        leitor.close();
    }

    public static String limiteVelocidade(int velocidade) {
        if (velocidade <= 60) {
            return "Nao foi multado";
        } else {
            return "Foi multado";
        }
    }
}