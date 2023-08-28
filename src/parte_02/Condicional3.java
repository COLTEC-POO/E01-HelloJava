package parte_02;

import java.util.Scanner;

public class Condicional3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valor;

        System.out.println("Digite a nota: ");
        valor = entrada.nextInt();

        if(valor>=60)
            System.out.println("Passou!");
        else
            System.out.println("Nao passou!");
    }
}
