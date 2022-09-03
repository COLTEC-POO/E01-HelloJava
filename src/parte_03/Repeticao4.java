package parte_03;

import java.util.Scanner;

public class Repeticao4 {
    public static void main(String[] args) {
        int valor, fat = 1;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Escolha um valor para calcular o fatorial: ");
        valor = entrada.nextInt();

        for(int i = 1; i <= valor; i++){
            fat *= i;
        }

        System.out.println("Fatorial de " + valor + " é " + fat) ;


    }
}
