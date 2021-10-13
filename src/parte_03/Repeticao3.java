package parte_03;

public class Repeticao3 {
    public static void main(String[] args){
        System.out.println("Todos os múltiplos de 7 entre 1 e 100:");
        for(int i = 0; i <= 100; i++) {
            if(i % 7 == 0) {
                System.out.println(i);
            }
        }
    }
}
