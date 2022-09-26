package parte_02;

import java.util.Scanner;

public class Condicional3 {

    public static void main(String [] args) {

        int num;      

        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira a nota do aluno:  ");
        num = entrada.nextInt();

        boolean notaMin = num >= 60;

        if(notaMin){
            System.out.println("O aluno(a) passou.");
        } else {
            System.out.println("O aluno(a) nao passou.");
        }
        
    }
    
}
