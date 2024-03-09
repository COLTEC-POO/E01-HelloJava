import java.util.*;
public class Condicional3 {
    public static void main(String[] args){
        Scanner notas = new Scanner(System.in);

        System.out.print("Digite a nota de um aluno: ");
        float Nota = notas.nextFloat();

        System.out.printf("Nota: %.2f\n", Nota);
        if (Nota >= 60){
            System.out.println("Esse aluno passou de ano!");
        }else{
            System.out.println("Esse aluno nao passou de ano!");
        }
    }

}
