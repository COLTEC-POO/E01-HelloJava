package parte_02;
import java.util.Scanner;

class Condicional3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite sua nota:");
        double nota = input.nextDouble();

        if(nota >= 60){
            System.out.println("Você passou de ano!");
        }
        else{
            System.out.println("Você foi reprovado!");
        }
    }
}
