package parte_03;

import java.util.Scanner;

public class Repeticao3{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 100; i++){
            if (i % 7 == 0){
                System.out.println(i);
            }
        }
    }
}