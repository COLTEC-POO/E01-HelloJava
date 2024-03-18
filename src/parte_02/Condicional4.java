package parte_02;

import java.util.Scanner;

public class Condicional4 {
    public static void main(String[] args) {

        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Digite a nota do aluno para ver o conceito que ele tirou na disciplina [0 ; 100].");
        System.out.print("Nota: ");

        double nota = entradaTeclado.nextDouble();

        if (nota >= 90 && nota <= 100) {

            System.out.println("O aluno tirou A.");

        } else if (nota >= 80 && nota < 90) {

            System.out.println("O aluno tirou B.");

        } else if (nota >= 70 && nota < 80) {

            System.out.println("O aluno tirou C.");

        } else if (nota >= 60 && nota < 70) {

            System.out.println("O aluno tirou D.");

        } else if (nota >= 40 && nota < 60) {

            System.out.println("O aluno tirou E.");

        } else if (nota >= 0 && nota < 40) {

            System.out.println("O aluno tirou F.");

        } else {

            System.out.println("Nota invalida, ela deve estar no intervalo de [0 ; 100].");
        }
    }
}
