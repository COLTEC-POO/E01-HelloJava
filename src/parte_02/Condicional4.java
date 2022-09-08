package parte_02;

import java.util.Scanner;

public class Condicional4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int nota;
        char conceito;

        System.out.print("Informe a nota do aluno: ");
        nota = teclado.nextInt();

        if (nota >= 90) {
            conceito = 'A';
        }else if(nota >= 80){
            conceito = 'B';
        }else if(nota >= 70){
            conceito = 'C';
        }else if(nota >= 60){
            conceito = 'D';
        }else if(nota >= 40){
            conceito = 'E';
        }else{
            conceito = 'F';
        }

        System.out.println("Conceito do aluno: " + conceito);
    }
}