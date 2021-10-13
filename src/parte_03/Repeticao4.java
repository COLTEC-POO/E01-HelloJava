package parte_03;
import java.util.Scanner;
public class Repeticao4 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int valor;
        int fat = 1;

        System.out.println("Digite um valor para calcular seu fatorial:");
        valor = entrada.nextInt();

        for(int i = 2; i <= valor; i++){
            fat *= i;
        }

        System.out.println( "O fatorial de " + valor + " é igual a " + fat );


    }
}
