package parte_02;

import java.util.Scanner;

public class Condicional5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int num1, num2;

        System.out.println("Digite o primeiro número: ");
        num1 = entrada.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = entrada.nextInt();

        if (num1 > num2){
            System.out.println(num1 + " é maior!");
        } else if (num2 > num1) {
            System.out.println(num2 + " é maior!");
        }else {
            System.out.println("Os números são iguais.");
        }
    }
}
