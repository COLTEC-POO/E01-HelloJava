package parte_02;

import java.util.Scanner;

public class Condicional4 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        float nota;

        System.out.println("Digite uma nota: ");
        nota = input.nextFloat();

        if (nota < 0 || nota > 100.0)
        {
            System.out.println("A nota deve ser entre 0 e 100");
            System.exit(1);
        }

        if (nota >= 90.0)
        {
            System.out.println("Conceito: A");
            System.exit(0);
        }
        if (nota >= 80.0 && nota <= 89.0)
        {
            System.out.println("Conceito: B");
            System.exit(0);
        }
        if (nota >= 70.0 && nota <= 79.0)
        {
            System.out.println("Conceito: C");
            System.exit(0);
        }
        if (nota >= 60.0 && nota <= 69.0)
        {
            System.out.println("Conceito: D");
            System.exit(0);
        }
        if (nota >= 40.0 && nota <= 59.0)
        {
            System.out.println("Conceito: E");
            System.exit(0);
        }
        if (nota < 40)
        {
            System.out.println("Conceito: F");
            System.exit(0);
        }
    }
}