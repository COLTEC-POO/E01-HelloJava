package parte_03;

import java.util.Scanner;

public class Repeticao4 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int valor;

        System.out.println("Insira um valor entre 0 e 12 e descubra seu fatorial: "); // 12 por questões de arquitetura 32bits
        valor = input.nextInt();

        while (valor < 0 || valor > 12) {
            System.out.println("Valor inválido, insira um valor dentro da faixa indicada: ");
            valor = input.nextInt();
        }
            input.close();

        int fatorial = 1;

        for (int i = 1; i <= valor; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + valor + " é " + fatorial);

    }
}
