package parte_02;

import java.util.Scanner;

public class Condicional3 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int notaAluno;

            System.out.print("Informe a nota do aluno: ");
            notaAluno = entrada.nextInt();
            entrada.nextLine();
            if(notaAluno >= 60){
                if(notaAluno > 100){
                    System.out.println("Nota não reconheida no sistema. Tente valores de 0 a 100");
                }else{
                    System.out.println("Aluno Aprovado!");
                }

            }else{
                if(notaAluno < 0){
                    System.out.println("Nota não reconheida no sistema. Tente valores de 0 a 100");
                }else{
                    System.out.println("Aluno reprovado");
                }
            }


    }
}
