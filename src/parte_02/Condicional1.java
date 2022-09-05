package com.learning;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Condicional1 {

    static Boolean impar(Integer numero){
        return ((numero % 2) == 1)? true:false;
    }

    static Boolean par(Integer numero){
        return ((numero % 2) == 0)? true:false;
    }

    public static void main(String[] args) {
        
        try (Scanner read = new Scanner(System.in)) {
            System.out.println("Informe um numero para verificar se é par");

            Integer numero = read.nextInt();
            
            String parImpar = (par(numero))? "par": "impar";

            System.out.println("O numero é " + parImpar);
        }
        
    }
}