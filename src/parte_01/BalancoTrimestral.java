public class BalancoTrimestral {
    public static void main(String[] args){
        float gastosJaneiro=15000;
        float gastosFevereiro=23000;
        float gastosMarco=17000;
        float gastosTrimestre;
        float mediaMensal;
        gastosTrimestre=gastosJaneiro+gastosFevereiro+gastosMarco;
        mediaMensal=(gastosTrimestre)/3;

        System.out.println("Gastos do trimestre: " + gastosTrimestre);
        System.out.printf("Valor da média mensal = " + mediaMensal);
    }

}
