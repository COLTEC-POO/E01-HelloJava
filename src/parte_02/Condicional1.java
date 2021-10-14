package parte_02;

import java.util.Scanner;

public class Condicional1 {

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        int n;

        System.out.println("Digite um número: ");
        n = input.nextInt();

        if (n % 2 == 0){

            System.out.println("Esse numero é par.");
        }
        else{

            System.out.println("Esse numero é ímpar.");
        }
    }
}
