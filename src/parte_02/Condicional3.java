package parte_02;

import java.util.Scanner; // Importa a classe Scanner para leitura de dados

public class Condicional3 {

    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        int nota;

        // Pede ao usuario a nota de um aluno
        System.out.println("Digite a nota do aluno (0 a 100)");
        nota = entradaTeclado.nextInt();

        if (nota >= 60) {
            System.out.println("Aluno aprovado");

        } else {
            System.out.println("Aluno reprovado");
        }
    }
}