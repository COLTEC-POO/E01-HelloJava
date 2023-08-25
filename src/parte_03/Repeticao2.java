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
//     Repeticao2.java: Imprima a soma entre 100 e 1000
package parte_03;

public class Repeticao2 {
    public static void main(String[] args) {

        int soma=0;

        for(int i=100; i<=1000; i++){
            soma += i ;
        }
        System.out.println("Soma: " + soma);
    }
}
