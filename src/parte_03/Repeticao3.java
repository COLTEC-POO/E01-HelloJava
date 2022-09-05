package com.learning;

import java.util.Arrays;
import java.util.List;

public class Repeticao3 {

    static Condicional2 verifica = new Condicional2();
    private static Integer numeroUm;
    private static Integer numeroDois;

    static void imprimeMultipoSeteEntreNM(){
        for (int i = numeroUm; i < numeroDois; i++)
            if(verifica.multiploSete(i))
                System.out.println(i + " ");
    }
    
    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            System.out.println("Informe os numeros para imprimir os multiplos de 7 entre ");

            numeroUm = read.nextInt();
            numeroDois = read.nextInt();

            if(numeroUm != null && numeroDois != null)
                imprimeMultipoSeteEntreNM();
            else
                System.out.println("Um ou mais numeros são invalidos!");

            System.out.println("Programa será finalizado");
        }
    }
}