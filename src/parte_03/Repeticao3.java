package parte_03;

public class Repeticao3 {

    public static void main(String[] args){

        int inicio = 1, fim = 100;

        for (int i = inicio; i <= fim; i++) {
            if (i % 7 == 0)
                System.out.println(i); 
        }
    
    }
}