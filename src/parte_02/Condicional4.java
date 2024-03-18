package parte_02;

import java.util.Scanner;

public class Condicional4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Nota do aluno: ");
        int num = scan.nextInt();

        if(num<40){
            System.out.println(num+"- F");
        }else if(num<59){
            System.out.println(num+"- E");
        }else if(num<69){
            System.out.println(num+"- D");
        }else if(num<79){
            System.out.println(num+"- C");
        }else if(num<89){
            System.out.println(num+"- B");
        }else{
            System.out.println(num+"- A");
        }

    }

}
