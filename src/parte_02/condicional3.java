package parte_02;

import java.util.Scanner;
public class condicional3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite a sua nota (0 a 100)");
        int nota = entrada.nextInt();
        if (nota >= 60) {
            System.out.println("aprovado");
        } else {
            System.out.println("reprovado");
        }
    }
}
