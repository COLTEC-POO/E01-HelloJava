package parte_02;
import java.util.Scanner;

public class Condicional4 {
    public static void main (String[] args){

        Scanner entrada = new Scanner(System.in);
        int nota;

        System.out.println("Digite a nota do/a aluno/a: ");
        nota = entrada.nextInt();

        if (nota >= 90) {
            System.out.println("Conceito A");
        } else if (nota >= 80){
            System.out.println("Conceito B");
        } else if (nota >= 70){
            System.out.println("Conceito C");
        } else if (nota >= 60){
            System.out.println("Conceito D");
        } else if (nota >= 40){
            System.out.println("Conceito E");
        } else {
            System.out.println("Conceito F");
        }
    }
}
