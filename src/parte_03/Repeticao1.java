package parte_03;
import java.util.Scanner;
class Repeticao1{
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
        for (int i = 100;i<=1000; i++){
            println(i);
        }
    }
}