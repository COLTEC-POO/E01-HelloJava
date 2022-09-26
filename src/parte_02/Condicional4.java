package parte_02;

import java.util.Scanner;

public class Condicional4 {
    

    public static void main(String[] args) {
    
    int num;      

        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira a nota do aluno para saber o conceito:  ");
        num = entrada.nextInt();

        if (num <= 100 && num >= 90)
            System.out.println("Nota em conceito: A.");
        else if (num <= 89 && num >= 80) {
            System.out.println("Nota em conceito:  B.");
        }else if (num <= 79 && num >= 70) {
            System.out.println("Nota em conceito:  C.");
        }else if (num <= 69 && num >= 60) {
            System.out.println("Nota em conceito:  D.");
        }else if (num <= 59 && num >= 40) {
            System.out.println("Nota em conceito:  E.");
        }else if (num <= 39 && num >= 0){
            System.out.println("Nota em conceito:  F.");
        }

    }
}
