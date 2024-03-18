package parte_03;
import java.util.Scanner;


public class Repeticao4
{
    public static void main(String[] args)
    {
        //declara o scanner
        Scanner input = new Scanner(System.in);

        //declara as variaveis
        int num;
        int fatorial = 1;

        //Digita o número que vamos ler
        System.out.print("Digite um número: ");
        num = input.nextInt();

        //for pra pegar todos os numero entre 100 e 1000
        for(int i = 1; i <= num; i++) {
            fatorial = fatorial*i;
        }

        //imprime o fatorial
        System.out.println(fatorial);
    }
}
