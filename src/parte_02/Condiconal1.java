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
//     Condicional1.java: Verificar se um número é par ou ímpar;

package parte_02;

import java.util.Scanner;

public class Condiconal1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numero;

        System.out.print("Digite um numero inteiro: ");
        numero = input.nextInt();

        if (numero % 2 == 0){
            System.out.println("O número eh PAR.");
        }
        else{
            System.out.println("O número eh IMPAR.");
        }
    }

}
