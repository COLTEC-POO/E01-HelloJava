package parte_02;

import java.util.Scanner;

public class Condicional1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o número: ");
        int num = scan.nextInt();

        if (num % 2 == 0) {
            System.out.println("É par");
        }else{
            System.out.println("É impar");
        }
    }
}
