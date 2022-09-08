package parte_02;

import java.util.Scanner;

public class Condicional5 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        float num1, num2;

        System.out.println("Digite dois numeros: ");
        num1 = input.nextFloat();
        num2 = input.nextFloat();

        if (num1 > num2)
        {
            System.out.println(num1 + " eh maior que " + num2);
        }
        else if (num2 > num1)
        {
            System.out.println(num2 + " eh maior que " + num1);
        }
        else
        {
            System.out.println("Os numeros sao iguais");
        }
    }
}