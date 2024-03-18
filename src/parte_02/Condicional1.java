package parte_02;

import java.util.Scanner; // Importa a classe Scanner para leitura de dados

public class Condicional1 {

    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        int num;

        // Pede ao usuario um numero
        System.out.println("Digite um numero");
        num = entradaTeclado.nextInt();

        if ((num%2) == 0) {
            System.out.println(+ num +" é par");

        } else {
            System.out.println(+ num +" é ímpar");
        }
    }

}
