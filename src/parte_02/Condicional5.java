package parte_02;

import java.util.Scanner;
public class Condicional5 {
    public static void main(String [] args){
        int n1;
        int n2;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite dois numeros inteiros: ");
        n1 = entrada.nextInt();
        n2= entrada.nextInt();

        if(n1>n2){
            System.out.println("O numero " +n1+ " é maior que o numero " +n2+"!" );
        }
        else if (n1==n2){
            System.out.println("O numero " +n1+ " é igual ao numero " +n2+"!" );
        }
        else if(n1<n2){
            System.out.println("O numero " +n1+ " é menor que numero " +n2+"!");
        }
        entrada.close();
    }
}
