package parte_02;

import java.util.Scanner;

public class Condicional4 {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        float nota;

        System.out.println("Digite aqui a nota: ");
        nota = input.nextFloat();

        if (nota < 0 || nota > 100){
            System.out.println("A nota devera ser entre 0 e 100");
            System.exit(0);
        }

        if (nota >= 90){
            System.out.println("Conceito A");
            System.exit(0);
        }
        if (nota >= 80 && nota < 90){
            System.out.println("Conceito B");
            System.exit(0);
        }
        if (nota >= 70 && nota < 80){
            System.out.println("Conceito C");
            System.exit(0);
        }
        if (nota >= 60 && nota < 70){
            System.out.println("Conceito D");
            System.exit(0);
        }
        if (nota >= 40 && nota < 60){
            System.out.println("Conceito E");
            System.exit(0);
        }
        if (nota < 40){
            System.out.println("Conceito F");
            System.exit(0);
        }
    }
}