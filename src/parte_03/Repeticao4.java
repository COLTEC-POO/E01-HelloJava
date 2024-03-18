package parte_03;

import java.util.Scanner;

public class Repeticao4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o número: ");
        int num = scan.nextInt();
        int total = 1;
        if (num!=0) {
            for (int i = 1; i <= num; ++i) {
                total *= i;
            }
        }
        System.out.println("Fatorial de "+num+" é "+total);
    }
}