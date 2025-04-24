package fundamentos;
 //Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
import java.util.Scanner;

public class Exer07 {

    public static void main(String[] args){

        Scanner ler =  new Scanner(System.in);

        System.out.println("Entre com o tamnho do lado do quadrado: ");
        double lado = ler.nextDouble();

        double area = Math.pow (lado, 2);

        System.out.println("A área do quadrado é: " + area);
        System.out.println("O dobro da área do quadrado é: " + (area * 2));




    }
}
