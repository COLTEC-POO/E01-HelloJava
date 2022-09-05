package parte_02;

import java.util.Scanner;

public class Condicional5 {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int num1, num2;

        System.out.print("Informe o primeiro numero para comparação: ");
        num1 = ent.nextInt();
        ent.nextLine(); //buffer problem
        System.out.print("Agora informe o segundo numero: ");
        num2 = ent.nextInt();
        ent.nextLine();

        if(num1 > num2){
            System.out.println("O primeiro valor inserido é maior -  " + num1 + " > " + num2);
        }else{
            System.out.println("O segundo valor inserido é maior -  " + num2 + " > " + num1);
        }
    }
}
