package parte_02;

import java.util.Scanner;

public class Condicional2 {
    public static void main(String[] args) {

        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Digite um numero para saber se eh ou nao multiplo de 7");
        System.out.print("Numero: ");

        int numero = entradaTeclado.nextInt();

        if ((numero % 7) == 0) {

            System.out.println("O numero " +numero+ " eh multiplo de 7.");

        } else {

            System.out.println("O numero " +numero+ " nao eh multiplo de 7.");
        }
    }
}

