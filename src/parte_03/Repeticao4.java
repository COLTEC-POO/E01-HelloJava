//Inclusoes
package parte_03;
import java.util.Scanner;

public class Repeticao4 {
    public static void main(String[] args) {

        //Funcao de entrada de dados
        Scanner input = new Scanner(System.in);

        //Declaracao das variaveis
        int fatorial, n;

        //Interacao com o usuario
        System.out.println("Digite um numero para calcular o fatorial: ");
        n = input.nextInt();

        //Calculo do fatorial
        for(fatorial = 1; n > 1; n = n - 1){
            fatorial = fatorial * n;
        }

        //Mostra o resultado final para o usuario
        System.out.println("Resultado: " + fatorial);

    }
}
