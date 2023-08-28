package parte_02;

import java.util.Scanner;

public class Condicional5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valor1, valor2;

        System.out.println("Insira dois valores que serão comparados");
        System.out.println("Valor 1: ");
        valor1 = input.nextInt();
        System.out.println("Valor 2: ");
        valor2 = input.nextInt();

        input.close();

        if (valor1 > valor2)
            System.out.println(valor1 + " é maior que" + " " + valor2);
        else
            System.out.println(valor1 + " é menor que" + " " + valor2);

    }
}
