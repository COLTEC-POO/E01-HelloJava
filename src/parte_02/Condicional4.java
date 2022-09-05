package parte_02;

import java.util.Scanner;

public class Condicional4 {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);


        char conceito;

        System.out.println("Digite a nota: ");
         float nota = entrada.nextFloat();


        if(nota>=90 && nota <=100){
            conceito = 'A';
        } else if(nota > 80 && nota <= 89){
            conceito = 'B';
        } else if (nota > 70 && nota <= 79) {
            conceito = 'C';
        } else if(nota > 60 && nota <= 69){
            conceito = 'D';
        } else if(nota >= 40 && nota <= 59){
            conceito = 'E';
        } else if (nota >= 0 && nota < 40) {
            conceito = 'F';
        } else {
            System.out.println("Nota inválida");
            return;
        }

        if(nota>= 60){
            System.out.printf("O aluno passou! Conceito = "+ conceito);
        } else {
            System.out.println("O aluno não passou. Conceito = " + conceito);
        }

    }
}
