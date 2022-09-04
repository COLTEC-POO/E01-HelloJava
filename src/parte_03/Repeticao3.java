package parte_03;

public class Repeticao3 {
    public static void main(String[] args){
        int i;
        int valorFinal = 100;

        for(i = 1; i <= valorFinal; i++){
            if(i % 7 == 0) System.out.printf("%d\n", i);
        }
    }
}
