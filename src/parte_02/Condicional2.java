package parte_02;
import java.util.Scanner;
public class Condicional2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número:");
        int valor = scanner.nextInt();
        if(valor%7==0){
            System.out.println("O número é múltiplo de 7");
        }else{
            System.out.println("O número não é múltiplo de 7");
        }
    }
}
