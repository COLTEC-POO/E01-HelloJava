package parte_02;
import java.util.Scanner;
public class Condicional1 {
    public static void main(String [] args){
        int numero;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero inteiro para saber se é ímpar ou par: ");
        numero = entrada.nextInt();

        if(numero%2 ==0){
            System.out.println("O numero " +numero+ " é par!");
        }
        else{
            System.out.println("O numero " +numero+ " é ímpar!");
        }
        entrada.close();
    }
    
}
