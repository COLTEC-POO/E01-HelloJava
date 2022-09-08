//Inclusoes
package parte_03;

public class Repeticao2 {
    //Programa principal
    public static void main(String[] args) {
        //Declaracao das variaveis
        int valor = 100;
        int total = 0;

        //Faz a soma entre 100 e 1000
        while(valor <= 1000){
            total = total + valor;
            valor++;
        }
        //Imprime o resultado
        System.out.println("Resultado: " + total);
    }
}
