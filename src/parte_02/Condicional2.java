package parte_02;
import java.util.Scanner;

public class Condicional2 {
    public static void main(String[] args) {
        System.out.println("Digite um número:");

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        if (num % 7 == 0)
            System.out.println("O número é múltiplo de 7.");
        else
            System.out.println("O número não é múltiplo de 7.");

        scan.close();
    }
}
