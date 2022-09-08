package parte_02;
import java.util.Scanner;

public class Condicional2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int num;

        System.out.println("Que numero deseja verificar? ");
        num = input.nextInt();

        if (num % 7 == 0)
            System.out.println("o numero e multiplo de 7");
        else
            System.out.println("o numero nao e multiplo de 7");
    }
}
