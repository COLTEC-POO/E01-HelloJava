package parte_02;

import java.util.Scanner;

public class Condicional5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valor1, valor2;

        System.out.println("Entre o numero1: ");
        valor1 = entrada.nextInt();

        System.out.println("Entre o numero2: ");
        valor2 = entrada.nextInt();

        if(valor1 > valor2) {
            System.out.println("O numero " + valor1 + " eh maior que o numero " + valor2);
        } else {
            System.out.println("O numero " + valor2 + " eh maior que o numero " + valor1);
        }
    }
}
