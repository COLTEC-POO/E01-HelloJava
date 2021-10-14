package parte_02;

import java.util.Scanner;

public class Condicional5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero1, numero2;

        System.out.println("Digite o primeiro numero: ");
        numero1 = entrada.nextInt();
        System.out.println("Digite o segundo numero: ");
        numero2 = entrada.nextInt();

        if (numero1 > numero2) {
            System.out.println("O numero " + numero1 + " é maior que o numero " + numero2);
        } else {
            System.out.println("O numero " + numero2 + " é maior que o numero " + numero1);
        }
    }
}
