package com.learning;

import java.util.Arrays;
import java.util.List;

public class Repeticao2 {

    private static Integer numero;

    static Integer fatorialRecursivo(){
        if(numero != 1){
            return numero * fatorialRecursivo(numero - 1);
        }
    }
    
    static Integer fatorial(){
        Integer fatorial = 1;
        for (int i = numero; i > 1; i--){
            fatorial *= i;
        }
        return fatorial;
    }

    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            System.out.println("Informe o numero para imprimir seu fatorial ");

            numero = read.nextInt();

            if(numero != null){
                System.out.println("O fatorial é" + fatorial());
                System.out.println("O fatorial de forma recursiva " + fatorialRecursivo());
            }
            else
                System.out.println("Um ou mais numeros são invalidos!");

            System.out.println("Programa será finalizado");
        }
    }
}