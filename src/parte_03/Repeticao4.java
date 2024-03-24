package parte_03;
import java.util.Scanner;

public class Repeticao4 {
    public static void main(String[] args) {
        System.out.println("Digite um número:");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int fact = 1;

        for (int i = num; i >= 1; i--){
            fact *= i;
        }
        System.out.println("O fatorial de " + num + " é " + fact);
    }
}
