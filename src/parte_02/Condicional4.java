package parte_02;
/*
*   Com base em uma nota de um aluno (0 a 100), imprimir o conceito que ele tirou na disciplina, conforme descrição:
*   A - 90 ou superior || B - 80 a 89 || C - 70 a 79 || D -60 a 69 || E - 40 a 59 || F - menos de 40
*/
import java.util.Scanner;

public class Condicional4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre a nota do Davih Duque ");
        int conceito = entrada.nextInt();

        if(conceito >= 90) {
            System.out.println("Davih Duque: A");
        } else if(conceito >= 80) {
            System.out.println("Davih Duque: B");
        } else if(conceito >= 70) {
            System.out.println("Davih Duque: C");
        } else if(conceito >= 60) {
            System.out.println("Davih Duque: D");
        } else if(conceito >= 40) {
            System.out.println("Davih Duque: E");
        } else if (conceito < 40) {
            System.out.println("Davih Duque: F");
        }
    }
}
