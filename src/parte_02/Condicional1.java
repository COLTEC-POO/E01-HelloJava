package parte_02;

import java.util.Scanner;

public class Condicional1 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int num;

        System.out.println("Insira um número para descobrir se ele é par ou ímpar:");
        num = entrada.nextInt();

        if (num % 2 == 0){
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }
    }
}
