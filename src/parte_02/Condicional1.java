package parte_02;
import java.util.Scanner;

public class Condicional1 {

    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int num;

        System.out.println("Digite um numero inteiro: ");
        num = entrada.nextInt();

        if ( num % 2 == 0) {
            System.out.println("O numero eh par");
        } else {
            System.out.println("O numero eh impar");
        }
    }
}
