package parte_02;
import java.util.Scanner;
public class Condicional5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número:");
        int n1 = scanner.nextInt();
        System.out.print("Digite o segundo número:");
        int n2 = scanner.nextInt();
        if(n1>n2){
            System.out.print("O primeiro número é maior");
        }else{
            System.out.print("O segundo número é maior");
        }
    }
}
