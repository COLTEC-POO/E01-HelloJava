package parte_02;
import java.util.Scanner;

class Condicional4{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite sua nota:");
        double nota = input.nextDouble();

        if(nota >= 90){
            System.out.println("A");
        }
        else if(nota >= 80 && nota < 90){
            System.out.println("B");
        }
        else if(nota >= 70 && nota < 80){
            System.out.println("C");
        }
        else if(nota >= 60 && nota < 70){
            System.out.println("D");
        }
        else if(nota >= 40 && nota < 60){
            System.out.println("E");
        }
        else if(nota < 40){
            System.out.println("F");
        }
    }
}
