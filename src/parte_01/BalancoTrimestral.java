package parte_01;

public class BalancoTrimetral {

    public static void main(String[] args)
    {
        int gastoJaneiro = 15000;
        int gastoFevereiro = 23000;
        int gastoMarco = 17000;

        float gastoTrimestre = gastoJaneiro + gastoFevereiro + gastoMarco ;
        a
        System.out.printf("Gasto trimestral: %d\n",gastoTrimestre);

        double mediaMensal = gastoTrimestre / 3;

        System.out.printf("Media mensal = " + mediaMensal);
    }

}