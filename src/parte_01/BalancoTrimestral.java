package parte_01;

public class BalancoTrimestral {
    public static void main(String args[]) {
        float gastosJaneiro = 15000;
        float gastosFevereiro = 23000;
        float gastosMarco = 17000;
        float gastosTrimestre = gastosJaneiro+gastosFevereiro+gastosMarco;
        float mediaMensal = gastosTrimestre/3;
        System.out.println(gastosTrimestre);
        System.out.println("Valor da média mensal = "+ mediaMensal);
    }
}