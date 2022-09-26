package parte_03;

import java.util.Scanner;

public class Repeticao4 {

    public static void main(String[] args) {
        
    int num, fatorial = 1;

    Scanner entrada = new Scanner(System.in);

    System.out.print("Insira um numero para saber seu fatorial: ");
    num = entrada.nextInt();

    for(int i = 1; i <= num; i++){
        fatorial = fatorial*i;
    }
    
    System.out.println(num + "! = " + fatorial);
    
    }
    
}
