package parte_02;

import java.util.Scanner;

public class Condicional3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int conceito;

        System.out.println("Entre a nota do Joao Montandon ");
        conceito = entrada.nextInt();

        if(conceito >= 60) {
            System.out.println("O Joao Montadon passou de ano");
        } else {
            System.out.println("O Joao Montadon nao passou de ano");
        }
    }
}
