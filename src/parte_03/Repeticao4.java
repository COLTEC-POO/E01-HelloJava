package parte_03;

import java.util.Scanner; // Importa a classe Scanner para leitura de dados

public class Repeticao4 {

    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        int num;
        int f1 = 1;
        int f2 = 1;

        // Pede ao usuario um numero
        System.out.println("Digite um numero e veja seu fatorial");
        num = entradaTeclado.nextInt();

        for (int i = 0; i < num; i++) {
            f2 = f1 * f2;
            f1++;
        }

        System.out.println("!" + num + " = " + f2);
    }
}