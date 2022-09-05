package com.learning;

import java.util.Arrays;
import java.util.List;

public class BalancoTrimestral {
    public static void main(String[] args) {
        Integer gastosJaneiro = 15_000;
        Integer gastosFevereiro = 23_000;
        Integer gastosMarco = 17_000;
        Boolean maiorDeIdade = true;

        Integer gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
        Double mediaMensal = gastosTotais/3.0;

        System.out.println("O total de gastos do Trimestre é R$" + gastosTrimestre);
        System.out.println("A media de gastos do Trimestre é R$" + mediaMensal);
    }
}