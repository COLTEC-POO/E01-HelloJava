package parte_02;
import java.util.Scanner;
public class Condicional5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1;
        int numero2;
        System.out.println("Digite o primeiro numero");
        numero1 = scanner.nextInt();
        System.out.println("Digite o segundo numero");
        numero2 = scanner.nextInt();
        if(numero1>numero2){
            System.out.println("O primeiro numero e maior que o segundo");
        }else{
            System.out.println("O segundo numero e maior que o primeiro");
        }
    }
}