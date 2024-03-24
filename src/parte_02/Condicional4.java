package parte_02;
import java.util.Scanner;

public class Condicional4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a nota:");
        int num = scan.nextInt();

        while (num < 0 || num > 100){
            System.out.println("A nota deve estar entre 0 e 100");
            num = scan.nextInt();
        }

        if (num >= 90)
            System.out.println("Conceito A.");
        else if (num >= 80)
            System.out.println("Conceito B.");
        else if (num >= 70)
            System.out.println("Conceito C.");
        else if (num >= 60)
            System.out.println("Conceito D.");
        else if (num >= 40)
            System.out.println("Conceito E.");
        else
            System.out.println("Conceito F.");

        scan.close();
    }
}
