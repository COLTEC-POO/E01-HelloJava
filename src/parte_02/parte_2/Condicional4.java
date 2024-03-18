package parte_02.parte_2;

import java.util.Scanner;

public class Condicional4 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int i = 1; //Variável para identificar o aluno

        while(true){

            System.out.printf("\nDigite a nota do aluno %d(0-100): ",i);

            int nota = scanner.nextInt(); //Variável para verificar o conceito

            if(nota >= 90) //Verificação de conceito do aluno
                System.out.println("O aluno "+ i +" passou de ano com conceito A!");

            else if(nota >= 80 && nota <= 89)
                System.out.println("O aluno "+ i +" passou de ano com conceito B!");

            else if(nota >= 70 && nota <= 79)
                System.out.println("O aluno "+ i +" passou de ano com conceito C!");

            else if(nota >= 60 && nota <= 69)
                System.out.println("O aluno "+ i +" passou de ano com conceito D!");

            else if(nota >= 40 && nota <= 59)
                System.out.println("O aluno "+ i +" não passou com conceito E!");

            else if(nota < 40)
                System.out.println("O aluno "+ i +" não passou com conceito F!");

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