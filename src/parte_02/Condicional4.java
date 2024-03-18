package parte_02;

import java.util.Scanner;

public class Condicional4 {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota desejada: ");
        int nota = scanner.nextInt();

        if (nota >= 90 && nota <= 100) {
            System.out.println("Conceito: A");
        } else if (nota >= 80 && nota <= 89) {
            System.out.println("Conceito: B");
        } else if (nota >= 70 && nota <= 79) {
            System.out.println("Conceito: C");
        } else if (nota >= 60 && nota <= 69) {
            System.out.println("Conceito: D");
        } else if (nota >= 40 && nota <= 59) {
            System.out.println("Conceito: E");
        } else if (nota < 40 && nota >= 0) {
            System.out.println("Conceito: F");
        } else {
            System.out.println("Nota inválida. Por favor, insira um número entre 0 e 100.");
        }

    }

}
