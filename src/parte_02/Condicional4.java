package parte_02;

import java.util.Scanner;

public class Condicional4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int nota;

        System.out.println("Insira a nota do aluno e descubra o conceito: ");
        nota = input.nextInt();
        input.close();

        if (nota >= 90)
            System.out.println("Conceito A");
        else if (nota >= 80 && nota <= 89)
            System.out.println("Conceito B");
        else if (nota >= 70 && nota <= 79)
            System.out.println("Conceito C");
        else if (nota >= 60 && nota <= 69)
            System.out.println("Conceito D");
        else if (nota >= 40 && nota <= 59)
            System.out.println("Conceito E");
        else if (nota <= 40)
            System.out.println("Conceito F");
    }
}
