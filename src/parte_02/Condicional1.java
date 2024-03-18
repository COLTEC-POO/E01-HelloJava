package parte_02;
import java.util.Scanner;

public class Condicional1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número:");
        double numero = input.nextDouble();

        if(numero%2 == 0){
            System.out.println("Esse número é par!");
        }
        else{
            System.out.println("Esse número é ímpar!");
        }
    }
}
