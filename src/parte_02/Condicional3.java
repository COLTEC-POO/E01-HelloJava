package parte_02;

import java.util.Scanner;

public class Condicional3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int nota;

        System.out.println("Insira a nota de um aluno e descubra se ele foi aprovado:");
        nota = input.nextInt();
        input.close();

        if (nota >= 60)
            System.out.println("O aluno foi aprovado!");
        else 
            System.out.println("O aluno foi reprovado");

    }
}
