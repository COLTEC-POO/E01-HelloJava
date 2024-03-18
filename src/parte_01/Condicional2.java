package parte_02;

import java.util.Scanner;

public class Condicional2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o número: ");
        int num = scan.nextInt();

        if (num % 7 == 0) {
            System.out.println("É múltiplo de 7");
        }else{
            System.out.println("Não é múltiplo de 7");
        }
    }
}
