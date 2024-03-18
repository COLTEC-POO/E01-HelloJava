package parte_02;

import java.util.Scanner;
public class condicional1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite um numero");
        int num = entrada.nextInt();
        if (num % 2 == 0) {
            System.out.println("o numero é par");
        } if (num % 2 != 0) {
            System.out.println("o numero é impar");
        }
    }
}
