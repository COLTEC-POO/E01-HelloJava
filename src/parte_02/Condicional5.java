package parte_02;

import java.util.Scanner;

public class Condicional5 {

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        float num1;
        float num2;

        System.out.println("Digite o primeiro numero: ");
        num1 = input.nextFloat();

        System.out.println("Digite o segundo numero: ");
        num2 = input.nextFloat();

        if (num1 > num2){
            System.out.println("O primeiro numero é maior que o segundo");
        }
        else if (num1 < num2){
            System.out.println("O segundo numero é maior que o primeiro");
        }
        else{
            System.out.println("Os numeros sao iguais");
        }
    }
}