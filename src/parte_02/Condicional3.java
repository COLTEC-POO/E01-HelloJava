package parte_02;

import java.util.Scanner;

public class Condicional3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float notaAluno;
        float notaMinima = 60;
        boolean ERRO;

        do{
            System.out.println("Infome a nota do aluno: ");
            notaAluno = entrada.nextFloat();
            ERRO = (notaAluno < 0 || notaAluno > 100);

            if(ERRO) System.out.println("Nota informada invalida, tente novamente!");

        }while(ERRO);


        if(notaAluno >= notaMinima){
            System.out.println("Aluno Aprovado!");
        }else{
            System.out.println("Aluno Reprovado!");
        }
    }
}
