package parte_02;

import java.util.Scanner;

public class Q2Cond2 {

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.printf("digite um numero: ");

        num = sc.nextInt();

        if(num % 7 == 0){
            System.out.printf("O numero e multiplo de 7\n");
        }
        else{
            System.out.printf("O numero nao e multiplo de 7\n");
        }
    }
}
