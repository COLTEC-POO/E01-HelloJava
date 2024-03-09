import java.util.Scanner;
public class Condicional5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o Numero 1: ");
        float num1 = input.nextFloat();

        System.out.print("Digite o Numero 2: ");
        float num2 = input.nextFloat();
        int maior = 0;
        if(num1 > num2){
            maior = (int)num1;
            System.out.println("Maior numero: " + maior);
        }else{
            maior = (int)num2;
            System.out.println("Maior numero: " + maior);
        }
    }
}
