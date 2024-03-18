package parte_03;

//Parte 3-b:
//Classe ImprimirSoma
public class Repeticao2 {
    //Bloco main
    public static void main (String[] args) {
        System.out.println("Imprimir a soma entre 100 e 1000");

        //variavel para a soma dos valores
        int soma = 0;

        //imprimir os numeros
        for (int numero = 100; numero <= 1000; numero++) {
            soma += numero;
        }

        System.out.println(soma);
    }
}