package parte_02;
import java.util.Scanner;
public class Condicional2 {

    public static void main(String[] args) {

        //declara o scanner
        Scanner input = new Scanner(System.in);

        //declara a variavel
        int num;

        //Digita o número que vamos ler
        System.out.print("Digite um número: ");
        num =input.nextInt();

    //Verifica se é ou nao multiplo de 7
        if(num %7==0)
        {
            System.out.println("É multiplo de 7");
        } else
        {
            System.out.println("Não é multiplo de 7");
        }

    }
}
