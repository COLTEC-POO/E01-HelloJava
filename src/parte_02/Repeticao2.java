package parte_03;

import java.util.Scanner;

public class Repeticao2 {
    public static void main(String[] args){
        int n = 0;
        for(int i = 100; i<=1000; ++i){
            n+=i;
        }
        System.out.println("A soma de 100 a 1000: " + n);
    }
}