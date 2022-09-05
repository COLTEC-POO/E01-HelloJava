package com.learning;

import java.util.Arrays;
import java.util.List;

public class Repeticao1 {

    private static Integer numeroUm;
    private static Integer numeroDois;

    static void imprimeEntreNM(){
        for (int i = numeroUm; i < numeroDois; i++)
            System.out.println(i + " ");
    }
    
    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            System.out.println("Informe os numeros para imprimir entre ");

            numeroUm = read.nextInt();
            numeroDois = read.nextInt();

            if(numeroUm != null && numeroDois != null)
                imprimeEntreNM();
            else
                System.out.println("Um ou mais numeros são invalidos!");

            System.out.println("Programa será finalizado");
        }
    }
}