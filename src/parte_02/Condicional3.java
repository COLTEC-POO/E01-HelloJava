package parte_02;

import java.util.Scanner;

public class Condicional3 {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        float nota;

        System.out.println("Digite aqui a nota: ");
        nota = input.nextFloat();

        if (nota < 0 || nota > 100.0){
            System.out.println("A nota deverá ser entre 0 e 100");
        }

        else if (nota >= 60.0){
            System.out.println("O aluno foi aprovado");
        }

        else{
            System.out.println("O aluno foi reprovado");
        }
    }
}
