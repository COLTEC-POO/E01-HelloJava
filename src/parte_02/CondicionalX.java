package parte_02;

import java.util.Scanner;

public class CondicionalX {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valor;

        System.out.println("Digite o valor: ");
        valor = entrada.nextInt();

        if(valor % 2 == 0)
            System.out.println("Valor eh par!");
        else
            System.out.println("Valor eh impar!");
    }
}
