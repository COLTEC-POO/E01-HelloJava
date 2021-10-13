package parte_03;

public class Repeticao4 {

    public static void main (String[] args){
        int num = 11;
        int fat = num - 1;

        while (fat > 0){
            num = num * fat;
            fat--;
        }
        System.out.println("O fatorial do número 11 é: " + num);
    }
}
