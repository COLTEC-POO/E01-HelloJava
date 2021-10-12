package parte_02;

import java.util.Scanner;

public class Condicional1 {
    public static void main(String[]args){
        Scanner entrada=new Scanner(System.in);

        int valor;

        System.out.println("Digite o valor:");
        valor= entrada.nextInt();

        if(valor % 2==0)
            System.out.println("Valor é par!");
        else
            System.out.println("Valor é ímpar!");
    }
}
