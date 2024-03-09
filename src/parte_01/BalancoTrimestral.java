public class BalancoTrimestral {
    public static void main(String[] args) {

        int gastosJaneiro = 15000;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;

        float mediaMensal = (gastosJaneiro + gastosFevereiro + gastosMarco) / 3;
        int gastosTrimestres = gastosJaneiro + gastosFevereiro + gastosMarco;

        System.out.println("O gasto total do trimestre é: " + gastosTrimestres);
        System.out.println("Valor da média mensal = " + mediaMensal);
    }
}
