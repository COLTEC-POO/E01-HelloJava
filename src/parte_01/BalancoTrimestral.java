package parte_01;

public class BalancoTrimestral {
    public static  void main(String[] args) {
        int gastosJaneiro = 15_000;
        int gastosFevereiro = 23_000;
        int gastosMarco = 17_000;
        int trimestre = 3;

        int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
        int mediaMensal = gastosTrimestre/trimestre;

        System.out.println("Gastos Trimestre: R$ " + gastosTrimestre);
        System.out.println("A média mensal de gastos foi: R$ " + mediaMensal);
    }
}
