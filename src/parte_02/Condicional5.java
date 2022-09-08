package parte_02;

import java.util.Scanner;

public class Condicional5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("informe o primeiro numero");
        num1 = input.nextInt();

        System.out.println("informe o segundo numero");
        num2 = input.nextInt();

        if(num1 == num2)
            System.out.println("os numero sao iguais");
        else if (num1 > num2)
            System.out.println("o numero " + num1 + " e maior");
        else
            System.out.println("o numero " + num2 + " e maior");
    }
}
