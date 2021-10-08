package parte_03;
//Classe destinada para a utilização da estrutura de repetição for.
//Imprime números entre 100 e 1000
public class Repeticao1 {

    // Função main - primeira função a ser executada pela JVM/COMPILADOR
    public static void main(String[] args){
        //Variável utilizada
        short i;

        //Estrutura de repetição para garantir a impressão dos números ENTRE 100 a 1000, ou seja, do 101 a 999
        for(i= 101; i < 1000; i++){
            System.out.println("Número: " + i);
        }
    }
}
