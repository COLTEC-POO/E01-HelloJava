package parte_02;
import java.util.Scanner;
public class Condicional5 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o primeiro número:");
            float numero1 = scanner.nextFloat();
            System.out.println("Digite o segundo número:");
            float numero2 = scanner.nextFloat();


            if(numero1>numero2){
                System.out.println("O primeiro número digitado é maior");
            }
            else{
                System.out.println("O segundo número digitado é maior");
            }
        }
    }



