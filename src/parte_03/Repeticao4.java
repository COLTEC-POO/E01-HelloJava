package parte_03;

import java.util.Scanner;

public class Repeticao4{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("Digite um número: ");
        number = scanner.nextInt();

        for (int i = number - 1; i > 0; i--){
            number *= i;
        }

        System.out.println(number);

        scanner.close();
    }
}
