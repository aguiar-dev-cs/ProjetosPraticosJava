package fundamentos;

import java.util.Scanner;
import java.util.Locale; // Para garantir o uso do ponto como separador decimal

class Pessoa {
    String nome;
    int idade;
    double altura;

    // Construtor para inicializar os atributos da pessoa
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
}

public class Exer_DadosPessoas {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US); // Configura o Scanner para usar ponto como separador decimal

        System.out.print("Quantas pessoas você deseja cadastrar? ");
        int n = scan.nextInt();

        Pessoa[] pessoas = new Pessoa[n]; // Cria um array de objetos Pessoa

        // Loop para ler os dados de cada pessoa
        for (int i = 0; i < n; i++) {
            System.out.println("\nDados da " + (i + 1) + "ª pessoa:");
            System.out.print("Nome: ");
            scan.nextLine(); // Consome a quebra de linha pendente
            String nome = scan.nextLine();

            System.out.print("Idade: ");
            int idade = scan.nextInt();

            System.out.print("Altura (em metros, ex: 1.75): ");
            double altura = scan.nextDouble();

            pessoas[i] = new Pessoa(nome, idade, altura); // Instancia um novo objeto Pessoa e o armazena no array
        }

        // --- Cálculo da Altura Média ---
        double somaAlturas = 0;
        for (int i = 0; i < n; i++) {
            somaAlturas += pessoas[i].altura;
        }
        double alturaMedia = somaAlturas / n;
        System.out.printf("\nAltura média das pessoas: %.2f metros%n", alturaMedia);

        // --- Porcentagem de Pessoas com Menos de 16 Anos e Seus Nomes ---
        int contagemMenos16 = 0;
        for (int i = 0; i < n; i++) {
            if (pessoas[i].idade < 16) {
                contagemMenos16++;
            }
        }

        if (n > 0) { // Evita divisão por zero se não houver pessoas cadastradas
            double porcentagemMenos16 = (double) contagemMenos16 / n * 100;
            System.out.printf("Porcentagem de pessoas com menos de 16 anos: %.2f%%%n", porcentagemMenos16);
        } else {
            System.out.println("Nenhuma pessoa cadastrada.");
        }

        // Exibir nomes das pessoas com menos de 16 anos, se houver
        if (contagemMenos16 > 0) {
            System.out.println("Nomes das pessoas com menos de 16 anos:");
            for (int i = 0; i < n; i++) {
                if (pessoas[i].idade < 16) {
                    System.out.println("- " + pessoas[i].nome);
                }
            }
        } else {
            System.out.println("Não há pessoas com menos de 16 anos.");
        }

        scan.close();
    }
}