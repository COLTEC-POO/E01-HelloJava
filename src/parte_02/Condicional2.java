package parte_02;

import java.util.Scanner;

public class Condicional2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero % 7 == 0) {
            System.out.println(numero + " é múltiplo de 7.");
        } else {
            System.out.println(numero + " não é múltiplo de 7.");
        }

        scanner.close();
    }
}
