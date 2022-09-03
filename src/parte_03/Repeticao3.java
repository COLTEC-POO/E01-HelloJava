package parte_03;

public class Repeticao3 {
    public static void main(String[] args) {

        int cont = 1;

        System.out.println("Lista de multiplos de 7 de 1 a 100");
        for(int i = 1; i <= 100; i++){
            if(i % 7 == 0){
                System.out.println(cont + ".- " + i);
                cont++;
            }
        }
    }
}
