package parte_02;

import java.util.Scanner;
public class condicional5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite dois numeros");
        int num = entrada.nextInt();
        int num2 = entrada.nextInt();
        if (num > num2) {
            System.out.println("o maior numero é " + num);
        } if (num2 > num) {
            System.out.println("o maior numero é " + num2);
        }
    }
}