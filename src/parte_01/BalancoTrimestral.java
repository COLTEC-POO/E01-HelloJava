package parte_01;

public class BalancoTrimestral {
    public static void main(String[] args){

        int gastosJan = 15_000,
              gastosFev = 23_000,
              gastosMar = 17_000,
              gastosTri = gastosJan + gastosFev + gastosMar;

        float mediaMensal = (float) gastosTri / 3;

        System.out.println("Media mensal: " + mediaMensal);

    }
}
