package parte_03;
import java.util.Scanner;


public class Repeticao4 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o número: ");
        int num = entrada.nextInt();
        int i, fatorial = 1;
        for(i = 1; i < num; i++) {
            fatorial += fatorial * i;
        }
        System.out.println("Fatorial de %d = ".formatted(num) + fatorial);
    }
}
