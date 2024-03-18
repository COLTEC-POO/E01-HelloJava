package parte_02;

import java.util.Scanner;
public class condicional4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite a sua nota (0 a 100)");
        int nota = entrada.nextInt();
        if (nota < 40) {
            System.out.println("F");
        } if (nota >= 40 && nota <= 59) {
            System.out.println("E");
        } if (nota >= 60 && nota <= 69) {
            System.out.println("D");
        } if (nota >= 70 && nota <= 79) {
            System.out.println("C");
        } if (nota >= 80 && nota <= 89) {
            System.out.println("B");
        } if (nota >= 90 && nota <= 100) {
            System.out.println("A");
        }
    }
}