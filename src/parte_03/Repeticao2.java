package parte_03;

public class Repeticao2 {

    public static void main (String[] args){

        int i;
        int soma = 0;

        for (i = 101; i < 1000; i++)
        {
            soma = soma + i;
        }

        System.out.println("Soma = " + soma);
    }
}