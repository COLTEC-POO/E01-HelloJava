package com.learning;

import java.util.Arrays;
import java.util.List;

public class Condicional4 {

    static String conceito(Integer numero){
        if (numero < 0)
            return null;
        if (numero < 40)
            return "F";
        if (numero < 60)
            return "E";
        if (numero < 70)
            return "D";
        if (numero < 80)
            return "C";
        if (numero < 90)
            return "B";
        if (numero < 100)
            return "A";
        return null;            
    }   
        
    

    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            System.out.println("Informe a nota do aluno ");

            Integer numero = read.nextInt();
            
            String situacao = conceito(numero);

            if(situacao != null)
                System.out.println("O aluno ficou com conceito " + situacao);
            else
                System.out.println("Nota informada invalida");

            System.out.println("Programa será finalizado");
        }
    }
}