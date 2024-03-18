package parte_02;

import java.util.Scanner;

public class Condicional4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("digite a nota final do seu aluno : ");
        int Nota = sc.nextInt();

        if(nota_final >= 90){
            System.out.println("seu aluno foi nota A");
        }
        else if(nota_final >= 80 && nota_final <= 89){
            System.out.println("Nota do aluno: B");
        }
        else if(nota_final >= 70 && nota_final <= 79){
            System.out.println("Nota do aluno: C");
        }
        else if(nota_final >= 60 && nota_final <= 69){
            System.out.println("Nota do aluno: D");
        }
        else if(nota_final >= 49 && nota_final <= 59){
            System.out.println("Nota do aluno: E");
        }
        else if(nota_final < 40){
            System.out.println("Nota do aluno: F");
        }
    }
}
