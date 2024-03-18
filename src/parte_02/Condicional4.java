package parte_02;

import java.util.Scanner;

public class Condicional4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("digite a nota final do seu aluno : ");
        int NotaF = sc.nextInt();

        if(NotaF >= 90){
            System.out.println("seu aluno foi nota A");
        }
        else if(NotaF >= 80 && NotaF <= 89){
            System.out.println("Nota do aluno: B");
        }
        else if(NotaF >= 70 && NotaF <= 79){
            System.out.println("Nota do aluno: C");
        }
        else if(NotaF >= 60 && NotaF <= 69){
            System.out.println("Nota do aluno: D");
        }
        else if(NotaF >= 49 && NotaF <= 59){
            System.out.println("Nota do aluno: E");
        }
        else if(NotaF < 40){
            System.out.println("Nota do aluno: F");
        }
    }
}
