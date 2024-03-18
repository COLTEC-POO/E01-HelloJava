package parte_03;
import java.util.Scanner;
class Repeticao4{
    public static void println(String string){
        System.out.println(string);
    }
    public static void println(int integer){
        System.out.println(integer);
    }
    public static void print(String string){
        System.out.print(string);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        print("Digite um numero : ");
        int num = sc.nextInt();
        int fat = 1;
        for (int i = 1;i <= num; i++){
            fat *= i;
        }
        println("Fatorial de " + num + " é igual a : " + fat);
    }
}