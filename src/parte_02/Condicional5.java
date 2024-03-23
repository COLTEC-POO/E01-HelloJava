package parte_02;
import java.util.Scanner;

public class Condicional5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int num1 = scan.nextInt();
        System.out.println("Digite o segundo número:");
        int num2 = scan.nextInt();

        if (num1 > num2)
            System.out.println("o primeiro número é maior.");
        if (num1 < num2)
            System.out.println("O segundo número é maior.");
        if (num1 == num2)
            System.out.println("Os números são iguais.");

        scan.close();
    }
}
