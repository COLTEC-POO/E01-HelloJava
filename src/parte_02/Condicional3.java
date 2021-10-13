package parte_02;
import java.util.Scanner;
public class Condicional3 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int notaAluno;
        int media = 60;


        System.out.println("Digite a nota do aluno para verificar se ele foi aprovado:");
        notaAluno = entrada.nextInt();

        if(notaAluno > media)
            System.out.println("Aluno aprovado!");
        else
            System.out.println("Aluno não aprovado!");


    }
}
