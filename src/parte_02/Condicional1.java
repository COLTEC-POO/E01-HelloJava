package parte_02;

import java.util.Scanner;

public class Condicional1{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("digite um numero: ");
        int num = sc.nextInt();

        if(num % 2 == 0)
        {
            System.out.printf("seu numero eh par\n");
        }
        else
        {
            System.out.printf("seu numero eh impar\n");
        }

    }
}