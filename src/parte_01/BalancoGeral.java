package parte_01;

//Parte 1:
//Classe BalancoTrimestral
public class BalancoGeral {
        //Bloco main
        public static void main (String[] args) {
            //variaveis inteiras sendo inicializadas com seus respectivos valores
            int gastosJaneiro = 15000;
            int gastosFevereiro = 23000;
            int gastosMarco = 17000;

            //inicializacao da variavel com a soma das outras tres variaveis
            int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;

            //implementando: media mensal
            double mediaMensal = (double) gastosTrimestre/3;

            //imprimir as variaveis gastosTrimestre e mediaMensal
            System.out.println("Gastos do trimestre: " + gastosTrimestre);
            System.out.println("Valor da média mensal = " + mediaMensal);
        }
}
