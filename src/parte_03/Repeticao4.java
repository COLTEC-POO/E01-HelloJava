package parte_03;

import java.util.Scanner;

public class Repeticao4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int fat = 1;

        System.out.println("Entre um numero ");
        int numero = entrada.nextInt();

        for(int i = 1; i <= numero; i++) {
          fat *= i;
        }

        System.out.println(numero + "!" + " eh igual a " + fat);
    }
}
