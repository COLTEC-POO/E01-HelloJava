package parte_03;

import java.util.Scanner;

public class Repeticao2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        for (int i = 100; i <= 1000; i++){
            soma += i;
        }
        System.out.println(soma);
    }
}