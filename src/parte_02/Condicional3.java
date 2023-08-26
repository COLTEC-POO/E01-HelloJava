package parte_02;

import java.util.Scanner;

public class Condicional3 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int nota;

        System.out.println("Digite a nota do aluno:");
        nota = input.nextInt();

        if(nota >= 0 && nota <= 100){
            if(nota >= 60){
                System.out.println("O aluno foi aprovado!");
            }
            else{
                System.out.println("O aluno nao foi aprovado!");
            }
        }
    }
}

