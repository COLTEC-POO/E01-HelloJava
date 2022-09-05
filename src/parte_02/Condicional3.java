package com.learning;

import java.util.Arrays;
import java.util.List;

public class Condicional3 {

    static Boolean reprovado(Integer numero){
        return (numero < 60)? true:false;
    }

    static Boolean aprovado(Integer numero){
        return (numero > 59)? true:false;
    }

    public static void main(String[] args) {
        
        try (Scanner read = new Scanner(System.in)) {
            System.out.println("Informe a nota do aluno ");

            Integer numero = read.nextInt();
            
            String situacao = (aprovado(numero))? "aprovado": "reprovado ";

            System.out.println("O aluno foi  " + situacao);
        }
    }
}