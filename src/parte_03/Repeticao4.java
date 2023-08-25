/*
 * UFMG - Universidade Federal de Minas Gerais
 * COLTEC- Colégio Técnico
 * Disciplina: Programação Orientada a Objetos
 * Prof. João Eduardo
 *
 * Aluna: Marina Laura Villaça e Melo
 * Matrícula: 2023953906
 */

//     Exercício 03: Estruturas de Repetição
//     Repeticao4: Calcule o fatorial de um determinado número a sua escolha

package parte_03;
import java.util.Scanner;

public class Repeticao4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        int fatorial = 1;

        for(int i=1; i<=numero; i++){
            fatorial *= i;
        }

        System.out.println("Fatorial de " + numero + ": " + fatorial);
    }
}
