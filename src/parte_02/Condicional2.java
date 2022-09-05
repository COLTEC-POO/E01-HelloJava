package com.learning;

import java.util.Arrays;
import java.util.List;

public class Condicional2 {

    static Boolean multiploSete(Integer numero){
        return ((numero % 7) == 0)? true:false;
    }

    static Boolean restoUm(Integer numero){
        return ((numero % 7) == 1)? true:false;
    }

    static Boolean restoDois(Integer numero){
        return ((numero % 7) == 2)? true:false;
    }

    static Boolean restoTres(Integer numero){
        return ((numero % 7) == 3)? true:false;
    }

    static Boolean restoQuatro(Integer numero){
        return ((numero % 7) == 4)? true:false;
    }

    static Boolean restoCinco(Integer numero){
        return ((numero % 7) == 5)? true:false;
    }

    static Boolean restoSeis(Integer numero){
        return ((numero % 7) == 6)? true:false;
    }
    public static void main(String[] args) {
        
        try (Scanner read = new Scanner(System.in)) {
            System.out.println("Informe um numero para verificar se é multiplo de 7");

            Integer numero = read.nextInt();
            
            String multiplo = (multiploSete(numero))? "": "não ";

            System.out.println("O numero " + multiplo + "é multiplo");
        }
        
    }
}