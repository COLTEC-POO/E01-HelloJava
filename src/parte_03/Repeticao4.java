package parte_03;




import java.util.Scanner;


public class Repeticao4{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int Fat = 1;

        System.out.printf("Digite o numero desejado: ");
        int num = sc.nextInt();

        for(int i = num ; i != 0 ; i--)
        {
            Fat = Fat * i;
        }
        System.out.println(Fat);

    }
}