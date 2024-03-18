package parte_03;
import java.util.Scanner;

class Repeticao4
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fatorial = 1;

        System.out.println("Digite um numero: ");
        int numero = input.nextInt();

        for(int i = 1; i <= numero; i++){
            fatorial = fatorial*i;
        }

        System.out.println(fatorial);
    }
}
