package parte_02;

import java.util.Scanner;

public class Condicional2 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int num;

        System.out.println("Insira um número para verificar se ele é múltiplo de 7:");
        num = entrada.nextInt();

        if (num % 7 == 0){
            System.out.println("O número é múltiplo de 7.");
        } else {
            System.out.println("Não é múltiplo de 7.");
        }
    }
}
