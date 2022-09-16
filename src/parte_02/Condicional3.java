package parte_02;
import java.util.Scanner;
public class Condicional3 {
    public static void main(String [] args){
        int nota;
    
            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite a nota do aluno para saber se ele foi aprovado: ");
            nota = entrada.nextInt();
    
            if(nota>=60){
                System.out.println("Aluno Aprovado!");
            }
            else{
                System.out.println("Aluno Reprovado!");
            }
            entrada.close();
        }
}
