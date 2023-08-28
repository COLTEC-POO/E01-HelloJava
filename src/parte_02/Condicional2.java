package parte_02;

import java.util.Scanner;

public class Condicional2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valor;

        System.out.println("Digite o valor: ");
        valor = entrada.nextInt();

        if(valor % 7 == 0)
            System.out.println("Valor eh multiplo!");
        else
            System.out.println("Valor nao eh multiplo!");
    }
}
