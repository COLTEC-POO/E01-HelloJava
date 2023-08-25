/*
 * UFMG - Universidade Federal de Minas Gerais
 * COLTEC - Colégio Técnico
 * Disciplina: Programação Orientada a Objetos
 * Prof. João Eduardo
 *
 * Aluna: Marina Laura Villaça e Melo
 * Matrícula: 2023953906
 */

//    Exercício 02: Estruturas Condicionais
//    Condicional4.java: Com base em uma nota de um aluno (0 a 100),
//    imprimir o conceito que ele tirou na disciplina, conforme descrição abaixo:
//    A - 90 ou superior B - 80 a 89 C - 70 a 79 D - 60 a 69 E - 40 a 59 F - menos de 40

package parte_02;
import java.util.Scanner;

public class Condicional4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float nota;

        System.out.print("Digite a nota do aluno [0-100] : ");
        nota = input.nextFloat();

        if (nota>= 0 && nota<=100){

            if(nota>=60) {
                if(nota>=90)
                    System.out.println("CONCEITO A.");
                else if (nota>=80 && nota<=89)
                    System.out.println("CONCEITO B.");
                else if (nota>=70 && nota<=79)
                    System.out.println("CONCEITO C.");
                else if (nota>=60 && nota<=69)
                    System.out.println("CONCEITO D.");
            }

            else{
                if (nota>=40 && nota<=59)
                    System.out.println("CONCEITO E.");
                else
                    System.out.println("CONCEITO F.");
            }
        }

        else{
            System.out.println("NOTA INVALIDA.");
        }
    }

}
