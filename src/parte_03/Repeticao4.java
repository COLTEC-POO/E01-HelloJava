package parte_03;

import java.util.Scanner;

public class Repeticao4 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int num;
        int fatorial = 1;

        System.out.print("Informe o número: ");
        num = teclado.nextInt();

        if(num > 0){
            for(int i = num; i > 0; i--){
                fatorial *= i;
            }
        }

        System.out.println(fatorial);
    }
}
