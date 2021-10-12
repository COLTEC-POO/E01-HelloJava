package parte_02;

import java.util.Scanner;

public class Condicional3 {
    public static void main (String[] args){
        Scanner entrada= new Scanner (System.in);
        float nota;
        System.out.println("Informe a nota do aluno:");
        nota= entrada.nextFloat();
        if (nota<60)
            System.out.println("Aluno reprovado!");
        else
            System.out.println("Aluno aprovado!");
    }
}
