package parte_02;

import java.util.Scanner;

public class Condicional3 {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número desejado: ");
        int numero = scanner.nextInt();

        if(numero >= 60)
        {
            System.out.println("Aluno aprovado");
        }else{
            System.out.println("Aluno reprovado");
        }

    }

}
