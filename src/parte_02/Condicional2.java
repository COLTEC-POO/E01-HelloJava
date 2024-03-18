package parte_02;

import java.util.Scanner;

public class Condicional2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int number;

        System.out.println("Digite um número: ");

        number = scanner.nextInt();

        if (number % 7 == 0){
            System.out.println("O número inserido é múltiplo de 7");
        }
        else {
            System.out.println("O número inserido não é múltiplo de 7");
        }

        scanner.close();
    }
}