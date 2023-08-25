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
//     Repeticao3: Imprima todos os múltiplos de 7 entre 1 e 100

package parte_03;

public class Repeticao3 {
    public static void main(String[] args) {

        for(int i=1; i<=100; i++){
            if(i%7 == 0){
                System.out.println(i);
            }
        }
    }
}
