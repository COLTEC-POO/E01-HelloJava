package parte_02;
import java.util.Scanner;
class Condicional4{
    public static void println(String string){
        System.out.println(string);
    }
    public static void print(String string){
        System.out.print(string);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        print("Digite a nota do aluno : ");
        int nota = sc.nextInt();
        char conceito = '0';
        if (nota >= 90){
            conceito = 'A';
        }else if (nota >= 80){
            conceito = 'B';
        }else if (nota >= 70){
            conceito = 'C';
        }else if (nota >= 60){
            conceito = 'D';
        }else if (nota >= 40){
            conceito = 'E';
        }else{
            conceito = 'F';
        }
        println("O conceito do aluno, apartir da nota " + nota + " é : " + conceito);
    }
}