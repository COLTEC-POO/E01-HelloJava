package parte_03;

public class Repeticao3 {

    public static void main (String[] args){
        int somaMultiplo = 0;

        for (int i = 1; i < 101; i++){
            if (i % 7 == 0){
                somaMultiplo += i;
            }
        }
        System.out.println("A soma dos multiplos de 7 entre 1 e 100 é " + somaMultiplo);
    }
}
