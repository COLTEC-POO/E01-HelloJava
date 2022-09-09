package parte_03;

import java.util.Scanner;

public class Repeticao4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número para calcular seu fatorial: ");
        int n = entrada.nextInt();
        for(int fat = 1; n > 1; n -= 1)
            System.out.println(fat = fat * n);
    }
}
