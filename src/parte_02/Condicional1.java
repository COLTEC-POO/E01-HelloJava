package parte_02;
import java.util.Scanner;
public class Condicional1 {

    public static void main(String args[]) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero");
        int numero = scanner.nextInt();
        if(numero % 2 == 0){
            System.out.println("O numero e par");
        }else{
            System.out.println("O numero e impar");
        }
    }
}
