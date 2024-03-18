package parte_02;

import java.util.Scanner; // Importa a classe Scanner para leitura de dados

public class Condicional4 {

    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        int nota;

        // Pede ao usuario a nota de um aluno
        System.out.println("Digite a nota do aluno (0 a 100)");
        nota = entradaTeclado.nextInt();

        if (nota >= 90) {
            System.out.println("Este aluno tirou A");

        } else if (80 <= nota && nota <= 89){
            System.out.println("Este aluno tirou B");

        } else if (70 <= nota && nota <= 79){
            System.out.println("Este aluno tirou C");

        } else if (60 <= nota && nota <= 69){
            System.out.println("Este aluno tirou D");

        } else if (40 <= nota && nota <= 59){
            System.out.println("Este aluno tirou E");

        } else {
            System.out.println("Este aluno tirou F");
        }
    }
}