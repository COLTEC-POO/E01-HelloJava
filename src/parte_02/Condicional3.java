package parte_02;
import java.util.Scanner;

public class Condicional3 {
    public static void main (String[] args){

        Scanner entrada = new Scanner(System.in);
        int nota;

        System.out.println("Digite a nota do/a aluno/a:");
        nota = entrada.nextInt();

        if (nota >= 60){
            System.out.println("Aprovado/a!");
        } else {
            System.out.println("Reprovado/a");
        }
    }
}
