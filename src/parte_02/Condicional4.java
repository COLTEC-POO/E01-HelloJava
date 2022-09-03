package parte_02;

import java.util.Scanner;

public class Condicional4 {
    public static void main(String[] args) {

                Scanner entrada = new Scanner(System.in);
                int notaAluno;

                System.out.print("Informe a nota do aluno: ");
                notaAluno = entrada.nextInt();
                entrada.nextLine();

                if(notaAluno < 0 || notaAluno > 100){
                    System.out.println("Nota invalida, use valores de 0 a 100");
                }else {

                    if(notaAluno >= 90){
                        System.out.println("Tirou A");
                    }else if(notaAluno>= 80){
                        System.out.println("Tirou B");
                    } else if (notaAluno >= 70) {
                        System.out.println("Tirou C");
                    } else if (notaAluno >= 60) {
                        System.out.println("Tirou D");
                    } else if (notaAluno >= 40) {
                        System.out.println("Tirou E");
                    } else {
                        System.out.println("Tirou F");
                    }
                }

    }
}
