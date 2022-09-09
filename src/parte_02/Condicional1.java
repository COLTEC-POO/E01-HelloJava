package parte_02;

import java.util.Scanner;

public class Condicional1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número para verificar se é par ou ímpar: ");
        int num = entrada.nextInt();

        System.out.println((num % 2  == 0) ? "O número "+ num + " é par." : "O número "+ num + " é ímpar.");

    }
}
