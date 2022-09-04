package parte_02;

import java.util.Scanner;

public class Condicional4 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        float notaAluno;
        boolean ERRO;

        do{
            System.out.println("Infome a nota do aluno: ");
            notaAluno = entrada.nextFloat();
            ERRO = (notaAluno < 0 || notaAluno > 100);

            if(ERRO) System.out.println("Nota informada invalida, tente novamente!");

        }while(ERRO);

        switch((int)notaAluno){
            case 90:
                System.out.println("A nota do aluno é conceito A!");
                break;
            case 80:
                System.out.println("A nota do aluno é conceito B!");
                break;
            case 70:
                System.out.println("A nota do aluno é conceito C!");
                break;
            case 60:
                System.out.println("A nota do aluno é conceito D!");
                break;
            case 40:
                System.out.println("A nota do aluno é conceito E!");
                break;
            default:
                System.out.println("A nota do aluno é conceito F!");
                break;
        }
    }
}
