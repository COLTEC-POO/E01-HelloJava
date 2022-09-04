package parte_03;

import java.util.Scanner;

public class Repeticao4 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int valorLido, i;
        int fatorialValor = 1;

        System.out.println("Informe um valor para obter o fatorial: ");
        valorLido = entrada.nextInt();

        for (i = valorLido; i >= 1; i--){
            fatorialValor *= i;
        }

        System.out.printf("%s%d%s%d", "O fatorial do valor ", valorLido, " é igual a ", fatorialValor);

    }
}
