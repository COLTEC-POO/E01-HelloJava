package parte_03;

public class Repeticao2 {

    public static void main (String[] args){
        int resultado = 0;

        for (int i = 100; i < 1001; i++){
            resultado += i;
        }
        System.out.println("A soma de todos os numeros entre 100 e 1000 é " + resultado);
    }
}
