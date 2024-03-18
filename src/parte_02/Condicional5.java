package parte_02;

import java.util.Scanner;

public class Condicional5{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int number1, number2;

        System.out.println("Digite o primeiro número:");
        number1 = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        number2 = scanner.nextInt();

        if (number1 > number2){
            System.out.println("O primeiro número é maior que o segundo");
        }
        else if (number1 < number2){
            System.out.println("O primeiro número é menor que o segundo");
        }
        else {
            System.out.println("Os números são iguais");
        }

        scanner.close();
    }
}