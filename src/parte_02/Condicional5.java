package parte_02;
import java.util.Scanner;

public class Condicional5 {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = entrada.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = entrada.nextInt();

        if(num1 > num2){
            System.out.println("%d é maior que %d" .formatted(num1, num2));
        } else if (num1 == num2) {
            System.out.println("Os números são iguais");
        } else if (num1 < num2) {
            System.out.println("%d é maior que %d" .formatted(num2, num1));
        }

    }
}
