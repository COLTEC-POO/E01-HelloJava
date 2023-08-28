package parte_03;

import java.util.Scanner;

public class Repeticao4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int valor, fatorial = 1;

        System.out.println("Digite o valor:");
        valor = entrada.nextInt();

        for (int i = 1; i <= valor; i++) {
                fatorial *= i;
            }

        System.out.println(fatorial);
        }
    }
