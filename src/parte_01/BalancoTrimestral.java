package parte_01;

public class BalancoTrimestral {
    public static void main(String[] args){
        int gastosJaneiro = 15000, gastosFevereiro = 23000, gastosMarco = 17000;
        float gastosTrimestre = (float)gastosJaneiro + gastosFevereiro + gastosMarco;
        System.out.println(gastosTrimestre);

        float mediaMensal = gastosTrimestre/3;
        System.out.println("valor da média mensal = " + mediaMensal);
    }

}
