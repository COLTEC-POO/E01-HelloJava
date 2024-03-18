package parte_03;

import java.util.Scanner;


public class Repeticao2{

    public static void main(String[] args){

        int Soma = 0;

        for(int i = 100 ; i < 1000 ; i++)
        {
            Soma = i + Soma;
        }

        System.out.println(Soma);
    }
}
