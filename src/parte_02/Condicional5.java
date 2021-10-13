package parte_02;
import java.util.Scanner;
public class Condicional5 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int valor1;
        int valor2;

        System.out.println("Digite dois numeros para verificar qual deles e maior");
        System.out.println("Primeiro valor:");
        valor1 = entrada.nextInt();
        System.out.println("Segundo valor:");
        valor2 = entrada.nextInt();

        if(valor1 > valor2)
            System.out.println("O primeiro valor é maior!");
        else
            System.out.println("O segundo valor é maior!");
    }
}
