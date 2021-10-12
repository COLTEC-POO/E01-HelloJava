package parte_02;

import java.util.Scanner;

public class Condicional5 {
    public static void main (String[]args){
        Scanner entrada=new Scanner (System.in);

        int num1;
        int num2;

        System.out.println("Informe o primeiro numero:");
        num1= entrada.nextInt();

        System.out.println("Informe o segundo numero:");
        num2= entrada.nextInt();

        if(num1>num2)
            System.out.println("O primeiro numero é maior que o segundo.");
        else
            if(num1<num2)
                System.out.println("O segundo numero é maior que o primeiro");
            else
                System.out.println("Os números são iguais.");

    }
}
