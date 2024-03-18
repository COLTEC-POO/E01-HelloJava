package parte_03;

import java.util.Scanner;
public class repeticao4 {
    public static void main(String[] args) {
        System.out.println("digite o numero desejado para o fatorial");
        Scanner ft = new Scanner(System.in);
        int fat = ft.nextInt();
        System.out.println (fatorial(fat));
    }
    public static int fatorial (int n) {
        if(n==1 || n==0){
            return 1;
        }
        else {
            return n * fatorial(n-1);
        }
    }
}

