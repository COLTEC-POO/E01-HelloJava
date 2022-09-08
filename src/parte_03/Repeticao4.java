package parte_03;
import java.util.Scanner;

public class Repeticao4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        int ind = 0;
        int fat = 1;

        System.out.println("informe ate que numero que deseja fatoriar");
        num = input.nextInt();

        while(num!= 0){
            fat = fat * (num--);
            System.out.println(fat);
        }
    }
}

