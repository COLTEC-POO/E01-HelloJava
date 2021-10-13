package parte_02;
import java.util.Scanner;
public class Condicional4 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int notaAluno;
        int mediaB = 89;
        int mediaC = 79;
        int mediaE = 59;

        System.out.println("Digite a nota do aluno para verificar se ele foi aprovado:");
        notaAluno = entrada.nextInt();

        if(notaAluno >= 90 ) {
            System.out.println("Aluno aprovado com nota A!");
            System.exit(0);
        }
        if(notaAluno > 80 && mediaB <= 89){
            System.out.println("Aluno aprovado com nota B!");
            System.exit(0);
        }
        if(notaAluno > 70 && mediaC <= 79){
            System.out.println("Aluno aprovado com nota C!");
            System.exit(0);
        }
        if(notaAluno > 60 && mediaC <= 69){
            System.out.println("Aluno aprovado com nota D!");
            System.exit(0);
        }
        if(notaAluno > 40 && mediaE <= 59){
            System.out.println("Aluno reprovado com nota D!");
            System.exit(0);
        }
        if(notaAluno <= 40 ) {
            System.out.println("Aluno reprovado com nota E!");
            System.exit(0);
        }

    }
}
