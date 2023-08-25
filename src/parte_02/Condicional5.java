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
//     Condicional5.java: Dados dois números, verificar qual deles é maior;

package parte_02;
import java.util.Scanner;
public class Condicional5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero1, numero2;

        System.out.print("Digite o primeiro numero: ");
        numero1 = input.nextInt();

        System.out.print("Digite o segundo numero: ");
        numero2 = input.nextInt();

        if(numero1>numero2)
            System.out.println("O primeiro numero eh MAIOR.");

        else
            System.out.println("O segundo numero eh MAIOR.");

    }
}
