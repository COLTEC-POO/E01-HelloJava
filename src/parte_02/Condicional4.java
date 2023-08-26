package parte_02;

import java.util.Scanner;

public class Condicional4 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int nota;

        System.out.println("Digite a nota do aluno:");
        nota = input.nextInt();

        if(nota >= 0 && nota <= 100){

            if(nota >= 90){
                System.out.println("O aluno tirou A!");
            }
            else if(nota >= 80 && nota < 90){
                System.out.println("O aluno tirou B!");
            }
            else if(nota >= 70 && nota < 80){
                System.out.println("O aluno tirou C!");
            }
            else if(nota >= 60 && nota < 70){
                System.out.println("O aluno tirou D!");
            }
            else if(nota >= 50 && nota < 60){
                System.out.println("O aluno tirou E!");
            }
            else if(nota >= 40 && nota < 50){
                System.out.println("O aluno tirou E!");
            }
            else if(nota < 40){
                System.out.println("O aluno tirou F!");
            }
        }
    }
}
