package parte_02;

import java.util.Scanner;

public class Condicional1 {
    public static void main(String[] args) {

        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Digite um numero para saber se eh impar ou par");
        System.out.print("Numero: ");

        int numero = entradaTeclado.nextInt();

        if ((numero % 2) == 0) {

            System.out.println("O numero " +numero+ " eh par.");

        } else {

            System.out.println("O numero " +numero+ " eh impar.");
        }
    }
}