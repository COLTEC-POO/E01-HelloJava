package parte_02;

import java.util.Scanner;

public class Condicional2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número para verificar se ele é múltiplo de 7:");
        int num = entrada.nextInt();

        System.out.println((num % 7  == 0) ? "O número "+ num + " é múltiplo de 7." :"O número "+ num + " não é múltiplo de 7");

    }
}
