package parte_03;

import java.util.Scanner;

public class Repeticao4 {

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        int num, fat = 1;

        System.out.println("Digite um numero: ");
        num = input.nextInt();

        for (; num != 0; num = num - 1)
        {
            fat = fat * num;
        }

        System.out.println("Fatorial = " + fat);

    }
}