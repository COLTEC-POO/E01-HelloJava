package parte_02;

import java.util.Scanner; // Importa a classe Scanner para leitura de dados

public class Condicional2 {

    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        int num;

        // Pede ao usuario um numero
        System.out.println("Digite um numero");
        num = entradaTeclado.nextInt();

        if ((num%7) == 0 || num == 0) {
            System.out.println(+ num +" é múltiplo de 7");

        } else {
            System.out.println(+ num +" não é múltiplo de 7");
        }
    }
}