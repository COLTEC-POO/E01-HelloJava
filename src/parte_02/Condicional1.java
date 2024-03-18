package parte_02;

// Parte 2-a:
// Importar a classe Scanner
import java.util.Scanner;

// Classe ImparPar - Scanner
public class Condicional1 {
    // Bloco main
    public static void main(String[] args) {
        System.out.println("Impar ou par?");

        // Variável para guardar o número
        int numero;

        // Criar um objeto para o scanner coletar o valor
        Scanner input = new Scanner(System.in);

        // Pedir ao usuário para digitar um número:
        System.out.print("Digite um numero inteiro qualquer: ");
        numero = input.nextInt(); // Lê o número fornecido pelo usuário e armazena em 'numero'

        // Descobrir se é ímpar ou par
        if (numero % 2 == 0) {
            System.out.println("É par!");
        } else {
            System.out.println("É impar!");
        }

        // Fechar o scanner para evitar vazamentos de dados
        input.close();
    }
}
