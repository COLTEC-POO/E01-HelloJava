package parte_02;

import java.util.Scanner;

public class Condicional5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valor, valor2;

        System.out.println("Digite a valor: ");
        valor = entrada.nextInt();
        System.out.println("Digite a valor2: ");
        valor2 = entrada.nextInt();

        if(valor>valor2)
            System.out.println("Valor 1 maior");
        else
            System.out.println("Valor 2 eh maior!");
    }
}

