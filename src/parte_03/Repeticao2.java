package com.learning;

import java.util.Arrays;
import java.util.List;

public class Repeticao2 {

    private static Integer numeroUm;
    private static Integer numeroDois;

    static void imprimeSomaNM(){
        System.out.println(numeroUm + numeroDois);
    }
    
    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            System.out.println("Informe os numeros para somar ");

            numeroUm = read.nextInt();
            numeroDois = read.nextInt();

            if(numeroUm != null && numeroDois != null)
                imprimeSomaNM();
            else
                System.out.println("Um ou mais numeros são invalidos!");

            System.out.println("Programa será finalizado");
        }
    }
}