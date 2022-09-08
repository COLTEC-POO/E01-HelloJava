package parte_02;

import java.util.Scanner;

public class CondicionalX {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int nota;
        System.out.println ("Insira o numero: ");
        nota=leitor.nextInt();
        System.out.println((nota%2)==0 ? "par" : "impar");
        System.out.println((nota%7)==0 ? "divisivel por 7" : "nao divisivel por 7");
        System.out.println(nota>=60 ? "passou" : "reprovou");


        System.exit(0);

    }
}
