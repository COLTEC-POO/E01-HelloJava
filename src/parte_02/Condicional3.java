package parte_02;

import java.util.Scanner;
// Essa classe foi feita para realizar testes de notas de alunos e indicar se estão aprovados ou não
public class Condicional3 {

    // Função main - primeira função a ser executada pela JVM/COMPILADOR
    public static void main(String[] args){
        //Variáveis utilizadas
        float getGradeValue;
        byte getContinue;

        //Inclusão da função scanner
        Scanner input = new Scanner(System.in);
        do {
            //Instruções para a obteção de nota
            System.out.print("Por favor, informe a nota do aluno(a) (de 0 a 100) separando as casas decimais por virgula: ");
            getGradeValue = input.nextFloat();

            //Condições de teste para verificar se o aluno passou ou não de ano
            if (getGradeValue < 60) {
                System.out.println("Infelizmente o aluno(a) NÃO foi aprovado.");
            } else {
                System.out.println("Parabéns, o aluno(a) foi aprovado!");
            }

            //Verificando continuidade da função
            do {
                //Instruções para o usuário
                System.out.println("Deseja verificar a nota de outro aluno(a)?");
                System.out.print("Digite [1] para SIM e [0] para NÃO: ");
                getContinue = input.nextByte();//obtendo o valor para continuidade da execução

                if (getContinue > 1 || getContinue < 0) {
                    System.out.println("O valor digitado não corresponde a nenhuma das opções, por favor tente novamente.");
                }

            } while ((getContinue < 0) || (getContinue > 1));

        }while (getContinue != 0);
    }
}
