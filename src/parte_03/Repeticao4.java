package parte_03;

import java.util.Scanner;

public class Repeticao4 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.print("Insira um número para calcular o fatorial: ");
        numero = entrada.nextInt();

        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial do número inserido é: " + fatorial);
    }
}
