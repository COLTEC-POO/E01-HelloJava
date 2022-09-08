package parte_02;

import java.util.Scanner;

public class Condicional3 {

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

        if (nota >= 60.0)
        {
            System.out.println("O aluno passou de ano!!");
        }
        else
        {
            System.out.println("O aluno nao passou de ano :(");
        }
    }
}