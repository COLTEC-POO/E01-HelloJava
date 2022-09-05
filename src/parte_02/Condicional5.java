package com.learning;

import java.util.Arrays;
import java.util.List;

public class Condicional5 {

    private static Integer numeroUm;
    private static Integer numeroDois;

    static Integer maior(){
        return (numeroUm > numeroDois)? numeroUm:numeroDois;        
    }

    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            System.out.println("Informe os numeros para comparar ");

            numeroUm = read.nextInt();
            numeroDois = read.nextInt();

            if(numeroUm != null && numeroDois != null)
                System.out.println("O maior numero é " + maior());
            else
                System.out.println("Um ou mais numeros são invalidos!");

            System.out.println("Programa será finalizado");
        }
    }
}