package parte_02;
import java.util.Scanner;
class Condicional3{
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
        if (nota >= 60){
            println("O aluno passou de ano.");
        }else{
            println("O aluno não passou de ano.");
        }
    }
}