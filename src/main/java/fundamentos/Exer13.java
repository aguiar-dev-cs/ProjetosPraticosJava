package fundamentos;

/*Tendo como dados de entrada a altura e o sexo de uma pessoa,
construa um algoritmo que calcule seu peso ideal, utilizando as
seguintes fórmulas:
. Para homens: (72.7*h) - 58
a. Para mulheres: (62.1*h) - 44.7 (h = altura)
b. Peça o peso da pessoa e informe se ela está dentro, acima ou
abaixo do peso.*/

import java.util.Scanner;

public class Exer13 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe sua altura: ");
        double altura = scan.nextDouble();

        System.out.println("Qual seu sexo? M = Masculino, F = Feminino");
        String sexo = scan.next();

        double pesoIdeal;

        if (sexo.equalsIgnoreCase("M")) {
            pesoIdeal = (72.7 * altura) - 58;
        }
        else if (sexo.equalsIgnoreCase("F")) {
            pesoIdeal = (62.1 * altura) - 44.7;
        }
        else {
            System.out.println("Sexo inválido. Por favor, digite M ou F");
            scan.close();
            return;
        }

        System.out.println("Informe seu peso atual em kg: ");
        double pesoAtual = scan.nextDouble();

        System.out.println("Seu peso ideal é: " + pesoIdeal);

        if (pesoAtual == pesoIdeal) {
            System.out.println("Você está no seu peso ideal.");
        }
        else if (pesoAtual > pesoIdeal) {
            System.out.println("Você está acima do se peso ideal.");
        }
        else {
            System.out.println("Você está abaixo do seu peso ideal.");
        }
        scan.close();

    }


}
