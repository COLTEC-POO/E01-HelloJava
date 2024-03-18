package parte_03;

import java.util.Scanner;

public class Repeticao4 {
    public static void main(String[] args) {

        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Digite um numero para calcular o seu fatorial.");
        System.out.print("Numero: ");

        int numero = entradaTeclado.nextInt();
        long fatorial = 1;

        for(long i = 1; i <= numero; i++) {

            fatorial *= i;
        }

        System.out.println("O fatorial de "+numero+" eh "+fatorial);
    }
}
