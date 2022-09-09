package parte_02;

import java.util.Scanner;

public class Condicional3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a nota do aluno: ");
        int num = entrada.nextInt();

        if (num < 100 && num > 0)
            System.out.println((num >= 60) ? "Aluno APROVADO!! =)" : "Aluno REPROVADO!! =(");
        else
            System.out.println("Digite uma nota valida.");
    }
}
