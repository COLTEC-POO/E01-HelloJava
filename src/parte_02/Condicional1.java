package parte_02;
import java.util.Scanner;

public class Condicional1 {
    public static void main(String[] args) {
        System.out.println("Digite um número:");

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        if (num % 2 == 0)
            System.out.println("O número é par.");
        else
            System.out.println("O número é ímpar.");

        scan.close();
    }
}
