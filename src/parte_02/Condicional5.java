package parte_02;
import java.util.Scanner;
public class Condicional5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float numero = scanner.nextFloat();
        float numero2 = scanner.nextFloat();
        if(numero>numero2){
            System.out.println("O primeiro número é maior");
        }
        else{
            System.out.println("O segundo número é maior");
        }
    }
}