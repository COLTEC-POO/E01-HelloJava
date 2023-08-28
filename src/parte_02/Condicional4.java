package parte_02;

import java.util.Scanner;

public class Condicional4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valor;

        System.out.println("Digite a nota: ");
        valor = entrada.nextInt();

        if(valor<40)
            System.out.println("Nota F");
        if(valor>=40 && valor <= 59)
            System.out.println("Nota E");
        if(valor>=60 && valor <= 69)
            System.out.println("Nota D");
        if(valor>=70 && valor <= 79)
            System.out.println("Nota C");
        if(valor>=80 && valor <= 89)
            System.out.println("Nota B");
        if(valor>=90)
            System.out.println("Nota A");
    }

}
