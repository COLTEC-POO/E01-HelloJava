package parte_02;
import java.util.Scanner;
public class Condicional2 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int valor;

        System.out.println("Digite o valor para verificar se um número é múltiplo de 7:");
        valor = entrada.nextInt();

        if(valor % 7 == 0)
            System.out.println("Valor é multiplo de 7!");
        else
            System.out.println("Valor é não de multiplo 7!");

    }

}
