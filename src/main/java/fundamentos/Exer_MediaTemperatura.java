package fundamentos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exer_MediaTemperatura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<>();
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho"};
        double somaTemperaturas = 0;

        System.out.println("Digite a temperatura média dos seis primeiros meses do ano:");

        // Receber as temperaturas
        for (int i = 0; i < 6; i++) {
            System.out.print("Temperatura de " + (i + 1) + " - " + meses[i] + ": ");
            double temperatura = scanner.nextDouble();
            temperaturas.add(temperatura);
            somaTemperaturas += temperatura;
        }

        // Calcular a média semestral
        double mediaSemestral = somaTemperaturas / temperaturas.size();
        System.out.println("\nMédia semestral das temperaturas: " + String.format("%.2f", mediaSemestral));

        // Mostrar temperaturas acima da média
        System.out.println("\nTemperaturas acima da média semestral:");
        for (int i = 0; i < temperaturas.size(); i++) {
            if (temperaturas.get(i) > mediaSemestral) {
                System.out.println(meses[i] + ": " + String.format("%.2f", temperaturas.get(i)));
            }
        }

        scanner.close();
    }
}