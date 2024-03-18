package parte_02;
import java.util.Scanner;
public class Condicional4
{
    public static void main (String[] args) {

        //declara o scanner
        Scanner input = new Scanner(System.in);

        //declara a variavel
        float nota;

        //Digita o a nota que vamos ler
        System.out.print("Digite a nota de 0 a 100: ");
        nota = input.nextFloat();

        //Mostra a letrinha do aluno a partir da nota
        if (nota >= 90) {
            System.out.println("Tirou A");
        } else if (nota >= 80) {
            System.out.println("Tirou B");
        } else if (nota >= 70) {
            System.out.println("Tirou C");
        } else if (nota >= 60) {
            System.out.println("Tirou D");
        } else if (nota >= 40) {
            System.out.println("Tirou E");
        } else {
            System.out.println("Tirou F");
        }
    }
}
