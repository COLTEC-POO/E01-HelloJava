package parte_02;
import java.util.Scanner;
public class Condicional4 {
    public static void main(String [] args){
    int nota;
    
            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite a nota do aluno para saber o conceito: ");
            nota = entrada.nextInt();
    
            if(nota<40){
                System.out.println("Conceito : F");
            }
            else if(nota>=40 || nota<60){
                System.out.println("Conceito: E");
            }
            else if(nota>=60 || nota<70){
                System.out.println("Conceito: D");
            } 
            else if(nota>=70 || nota<80){
                System.out.println("Conceito: C");
            }
            else if(nota>=80 || nota<90){
                System.out.println("Conceito: B");
            }
            else if(nota>=90 || nota<=100){
                System.out.println("Conceito: C");
            }
            entrada.close();
        }
    
}
