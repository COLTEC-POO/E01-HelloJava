package parte_02;
import java.util.Scanner;

public class Condicional2 {

    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int num;

        System.out.println("Digite um numero para verificar se ele é multiplo de 7: ");
        num = entrada.nextInt();

        if (num % 7 == 0){
            System.out.println("O numero é multiplo de 7");
        } else{
            System.out.println("O numero não é múltiplo de 7");
        }

    }
}
