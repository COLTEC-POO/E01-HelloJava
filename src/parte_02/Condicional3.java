package parte_02;

import java.util.Scanner;

public class Condicional3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int nota;

        System.out.print("Informe a nota do aluno: ");
        nota = teclado.nextInt();

        if (nota >= 60) {
            System.out.println("Aluno aprovado com nota igual a " + nota);
        }else{
            System.out.println("Aluno reprovado com nota igual a " + nota);
        }
    }
}