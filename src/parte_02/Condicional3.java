package parte_02;

import java.util.Scanner;

public class Condicional3 {
    public static void main(String[] args) {

        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Digite a nota do aluno para verificar se ele passou ou nao de ano [0 ; 100].");
        System.out.print("Nota: ");

        double nota = entradaTeclado.nextDouble();

        if (nota >= 0 && nota < 60) {

            System.out.println("O aluno nao passou de ano.");

        } else if (nota >= 60 && nota <= 100) {

            System.out.println("O aluno passou de ano.");

        } else {

            System.out.println("Nota invalida, ela deve estar no intervalo de [0 ; 100].");
        }
    }
}
