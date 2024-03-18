package parte_02;

import java.util.Scanner;
public class condicional2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite um numero");
        int num = entrada.nextInt();
        if (num % 7 == 0) {
            System.out.println("o numero é multiplo de 7");
        } else {
            System.out.println("o numero não é multiplo de 7");
        }
    }
}
