import org.w3c.dom.Notation;

import java.util.Scanner;
public class Condicional4 {
    public static void main(String[] args){
        Scanner nota = new Scanner(System.in);
        int Verifica = 0;
        System.out.print("Digite a nota de um aluno: ");
        float Nota = nota.nextFloat();

        if(Nota >= 90){
            System.out.println("Conceito: A");
        }else {
            if (Nota > 80 && Nota < 89) {
                System.out.println("Conceito: B");
            } else {
                if (Nota > 70 && Nota < 79) {
                    System.out.println("Conceito: C");
                }else{
                    if(Nota > 60 && Nota < 69){
                        System.out.println("Conceito: D");
                    }else{
                        if(Nota > 40 && Nota < 59){
                            System.out.println("Conceito: E");
                        }else{
                            System.out.println("Conceito: F");
                        }
                    }
                }
            }
        }
    }
}
