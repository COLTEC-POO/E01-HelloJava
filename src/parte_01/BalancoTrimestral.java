/*
 * UFMG - Universidade Federal de Minas Gerais
 * COLTEC- Colégio Técnico
 * Disciplina: Programação Orientada a Objetos
 * Prof. João Eduardo
 *
 * Aluna: Marina Laura Villaça e Melo
 * Matrícula: 2023953906
 */

//     Exercício 01: Tipos Primitivos e Variáveis

package parte_01;

public class BalancoTrimestral {

    public static void main(String[] args) {
        int gastosJaneiro = 15000;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;
        int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;

        System.out.println("Gastos do trimestre: " + gastosTrimestre);

        float mediaMensal = gastosTrimestre/3;

        System.out.println("Valor da média mensal = " + mediaMensal);
    }

}
