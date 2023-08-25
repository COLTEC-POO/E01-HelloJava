/*
 * UFMG - Universidade Federal de Minas Gerais
 * COLTEC - Colégio Técnico
 * Disciplina: Programação Orientada a Objetos
 * Prof. João Eduardo
 *
 * Aluna: Marina Laura Villaça e Melo
 * Matrícula: 2023953906
 */

//     Exercício 02: Estruturas Condicionais
//     Condicional3.java: Com base em uma nota de um aluno (0 a 100), verificar se ele passou de ano.
//     O aluno passou de ano se sua nota for pelo menos 60;

package parte_02;
import java.util.Scanner;
public class Condicional3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float nota;

        System.out.print("Digite a nota do aluno [0-100] : ");
        nota = input.nextFloat();

        if (nota>= 0 && nota<=100){
            if(nota>=60) {
                System.out.println("ALUNO APROVADO.");
            }

            else{
                System.out.println("ALUNO REPROVADO.");
            }
        }
        else{
            System.out.println("NOTA INVALIDA.");
        }
    }

}
