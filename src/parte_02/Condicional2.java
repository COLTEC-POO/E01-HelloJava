package parte_02;

import java.util.Scanner;

public class Condicional2 {

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        int num;

        System.out.println("Digite um numero: ");
        num = input.nextInt();

        if (num % 7 == 0){
            System.out.println("Esse numero é multiplo de 7");
        }
        else{
            System.out.println("Esse numero nao é multiplo de 7");
        }
    }
}