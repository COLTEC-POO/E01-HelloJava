package parte_03;

//Parte 3-d:
//Classe ImprimirFatorial
public class Repeticao4 {
    //Bloco main
    public static void main (String[] args) {
        System.out.println("Calcular fatorial de 12");

        //armazena o valor de fatorial
        int fatorial = 0;

        //calcula o fatorial
        for (int numero = 0; numero <= 12; numero++) {
            fatorial += numero;
        }

        //imprime o fatorial
        System.out.println(fatorial);
    }
}
