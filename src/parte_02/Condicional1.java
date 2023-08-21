package parte_02;

import java.util.Scanner;

public class Condicional1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.println("Entre o 1o numero: ");
        numero = entrada.nextInt(); // nextInt = Entrada somente o proximo inteiro inserido;

        if(numero % 2 == 0) {
            System.out.println("O numero:  " + numero + " eh par");
        } else {
            System.out.println("O numero: " + numero + " eh impar");
        }
    }

}
