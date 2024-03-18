package parte_02;

import java.util.Scanner;

public class Condicional4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nota;

        System.out.println("Digite a nota do aluno:");
        nota = scanner.nextInt();

        if (nota >= 90) {
            System.out.println("A");
        } else if (nota >= 80) {
            System.out.println("B");
        } else if (nota >= 70) {
            System.out.println("C");
        } else if (nota >= 60) {
            System.out.println("D");
        } else if (nota >= 40 && nota <= 59) {
            System.out.println("E");
        } else if (nota < 40) {
            System.out.println("F");
        } else {
            System.out.println("Nota inválida");
        }

        scanner.close();
    }
}