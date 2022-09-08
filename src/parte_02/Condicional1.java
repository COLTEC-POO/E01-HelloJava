package parte_02;

import java.util.Scanner;

public class Condicional1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num;

        System.out.print("Informe o número: ");
        num = teclado.nextInt();

       if (num % 2 == 0) {
            System.out.println(num + " é par");
        } else {
            System.out.println(num + " é ímpar");
        }
    }
}
