package parte_02;

import java.util.Scanner;
public class Condicional1 {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            int num;

            System.out.println("qual numero deseja verificar?");
            num = input.nextInt();

            if (num % 2 == 0){
                System.out.println("este numero e par");
            }else{
                System.out.println("este numero e impar");
            }
        }
}

