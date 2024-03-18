package parte_03;

import java.util.Scanner;

public class Repeticao1 {
    public static void main(String[] args){
        for(int i = 100; i<=1000; ++i){
            System.out.print(i+" ");
            if(i%10 ==0){
                System.out.println();
            }
        }
    }
}