package parte_01;

// "Public" - corresponde ao nível de acesso, ou seja, ele será visível para todos
// "Class" - a parte mais abrangente do projeto, uma estrutura mais genérica.
// Com a inclusão de alguns atributos podemos dar origem a um objeto

public class BalancoTrimestral {

    // Função main - primeira função a ser executada pela JVM/COMPILADOR
    public static void main (String[] args){
        //Variáveis declaradas e inicializadas de acordo com a questão
        int gastosJaneiro = 15000;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;
        int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;

        //Variável para calcular a média mensal
        int mediaMensal = (gastosTrimestre / 3) ;

        //Imprime o valor da variável. Diferente da sintax em "C", não é necessário incluir "%_"
        //Basta solicitar o "print" da variável em sí.
        System.out.println("O gasto total do trimestre é de = R$" + gastosTrimestre);
        System.out.println("Já o valor da média mensal é de = R$" + mediaMensal);
    }
}
