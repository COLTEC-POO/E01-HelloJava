package parte_03;

//Parte 3-b:
//Classe ImprimirMultiplo7
public class Repeticao3 {
    //Bloco main
    public static void main (String[] args) {
        System.out.println("Imprimir multiplos de 7 entre 1 e 100");

        //imprimir os numeros
        for (int numero = 0; numero <= 100; numero++) {
            if (numero % 7 == 0) {
                System.out.println(numero);
            }
        }
    }
}
