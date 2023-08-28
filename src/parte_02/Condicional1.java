package parte_02;

import java.util.Scanner;

public class Condicional1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valor;

        System.out.println("Insira um valor e descubra se ele é par ou ímpar: ");
        valor = input.nextInt();
        input.close();

        if (valor % 2 == 0)
              System.out.println(valor + " é par!");
        else
              System.out.println(valor + " é ímpar!");

    }
    
}
