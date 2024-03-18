package parte_02;

import java.util.Scanner;

public class Condicional5 {
    public static void main(String[] args) {

        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Digite dois numeros (A e B) para saber qual eh maior");

        System.out.print("Numero A: ");
        double numeroA = entradaTeclado.nextDouble();

        System.out.print("Numero B: ");
        double numeroB = entradaTeclado.nextDouble();

        if (numeroA > numeroB) {

            System.out.println("O numero " +numeroA+ " eh maior que " +numeroB);

        } else if (numeroB > numeroA) {

            System.out.println("O numero " +numeroB+ " eh maior que " +numeroA);

        } else {

            System.out.println("Os numeros sao iguais.");
        }
    }
}