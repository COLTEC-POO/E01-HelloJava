package parte_01;

public class BalancoTrimestral {
        public static void main(String[] args) {

            int gastosJaneiro = 15000;
            int gastosFevereiro = 23000;
            int gastosMarco = 17000;
            int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;

            System.out.println("Total de gastos no trimestre: R$" + gastosTrimestre);
            float mediaMensal = (float)gastosTrimestre / 3;
            System.out.println("Valor da média mensal: R$" + mediaMensal);
        }
    }

