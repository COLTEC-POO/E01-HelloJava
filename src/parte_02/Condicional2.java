package parte_02;

import java.util.Scanner;

public class Condicional2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valor;

        System.out.println("Insira um valor e descubra se ele é múltiplo de 7:");
        valor = input.nextInt();
        input.close();

        if (valor % 7 == 0)
            System.out.println (valor + " é múltiplo de 7!");
        else
            System.out.println (valor + " não é múltiplo de 7");
    }
}
