package parte_02;
import java.util.Scanner;
public class Condicional1
{
    public static void main (String[] args) {
        //declara o scanner
        Scanner input = new Scanner(System.in);

        //declara a variavel
        int num;

        //Digita o número que vamos ler
        System.out.print("Digite um número: ");
        num = input.nextInt();

        //Verifica se é par senão é impar
        if (num % 2 == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é impar");
        }

    }
}
