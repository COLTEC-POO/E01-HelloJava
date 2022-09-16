package parte_02;
import java.util.Scanner;
public class Condicional2 {
    public static void main(String [] args){
    int numero;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero inteiro para saber se ele é multiplo de 7: ");
        numero = entrada.nextInt();

        if(numero%7 ==0){
            System.out.println("O numero " +numero+ " é um multiplo de7!");
        }
        else{
            System.out.println("O numero " +numero+ " não é um multiplo de 7!");
        }
        entrada.close();
    }
    
}
