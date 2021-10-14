package parte_02;

import java.util.Scanner;

public class Condicional4 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int nota;

        System.out.println("Digite a nota do aluno para obter o conceito: ");
        nota = entrada.nextInt();

        if (nota >= 90) {
            System.out.println("A");
        }else if ((nota >= 80) && (nota <= 89)){
            System.out.println("B");
        }else if ((nota >= 70) && (nota <= 79)){
            System.out.println("C");
        }else if ((nota >= 60) && (nota <= 69)){
            System.out.println("D");
        }else if ((nota >= 40) && (nota <= 59)){
            System.out.println("E");
        }else if(nota < 40){
            System.out.println("F");
        }
    }
}