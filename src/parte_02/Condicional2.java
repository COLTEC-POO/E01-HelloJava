package parte_02;

import java.util.Scanner;

public class Condicional2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num;

        System.out.print("Informe o número: ");
        num = teclado.nextInt();

        if (num % 7 == 0) {
            System.out.println(num + " é multiplo de 7");
        }else{
            System.out.println(num + " não é multiplo de 7");
        }
    }
}