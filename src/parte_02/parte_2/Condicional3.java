package parte_02.parte_2;

import java.util.Scanner;

public class Condicional3 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int i = 1; //Variável para identificar o aluno

        while(true){

            System.out.printf("\nDigite a nota do aluno %d(0-100): ",i);

            int nota = scanner.nextInt(); //Variável para verificar se o aluno passou ou não de ano

            if(nota >= 60 && nota <=100) //Verificação se o aluno passou de ano
                System.out.printf("O aluno %d passou de ano com nota %d!\n", i, nota);

            else //Caso não tenha passado, isso será imprimido
                System.out.printf("O aluno %d não passou de ano!\n", i);

            System.out.print("Deseja verificar a situação de outro aluno(S/N)? ");

            char opcao = scanner.next().charAt(0); //Verificar se deseja ver a situação de outro aluno

            if(opcao == 'S' || opcao == 's') { //Caso deseje, continua no loop

                i += 1; //Contador para identificar o aluno
                continue;

            }

            else //Caso contrário, não
                break;

        }

    }

}