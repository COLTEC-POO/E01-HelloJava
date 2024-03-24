package parte_02;
import java.util.Scanner;

public class Condicional3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a nota:");
        int num = scan.nextInt();

        while (num < 0 || num > 100){
            System.out.println("A nota deve estar entre 0 e 100");
            num = scan.nextInt();
        }

        if (num >= 60)
            System.out.println("O aluno passou de ano.");
        else
            System.out.println("O aluno não passou de ano.");

        scan.close();
    }
}
