package parte_02;
import java.util.Scanner;
public class Condicional3
{
    public static void main (String[] args) {

        //declara o scanner
        Scanner input = new Scanner(System.in);

        //declara a variavel
        float nota;

        //Digita o a nota que vamos ler
        System.out.print("Digite a nota de 0 a 100: ");
        nota = input.nextFloat();

        //Verifica se o aluno passou de ano
        if (nota >= 60) {
            System.out.println("Passou de ano");
        } else {
            System.out.println("Repetiu o ano");
        }
    }
}
