package parte_03;

import java.util.Scanner;

public class Repeticao4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;
        int fatorial = 1;
        int fat = 1;

        System.out.println("Digite um numero: ");
        num = input.nextInt();

        for (int i = 1; i <= num; i++){
            fat = fat * i;
            fatorial = fatorial * i;
        }

        System.out.println(num + "! = " + fat);
    }
}