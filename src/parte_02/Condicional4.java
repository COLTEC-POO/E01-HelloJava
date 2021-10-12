package parte_02;

import java.util.Scanner;

public class Condicional4 {
    public static void main (String[]args){
        Scanner entrada=new Scanner (System.in);

        float nota;

        System.out.println("Informe a nota do aluno:");
        nota= entrada.nextFloat();

        if (nota<40)
            System.out.println("Conceito:F");
        else
            if(nota<59)
                System.out.println("Conceito:E");
            else
                if(nota<69)
                    System.out.println("Conceito:D");
                else
                    if(nota<79)
                        System.out.println("Conceito:C");
                    else
                        if(nota<89)
                            System.out.println("Conceito:B");
                        else
                            System.out.println("Conceito:A");
    }
}
