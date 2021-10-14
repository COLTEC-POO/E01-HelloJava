package parte_01;

public class BalancoTrimestral {
    public static void main(String[] args){

        int gastosJaneiro = 1500;
        int gastosFevereito = 23000;
        int gastosMarco = 17000;
        int gastosTrimentre = gastosJaneiro + gastosFevereito + gastosMarco;
        int mediaMensal = gastosTrimentre / 3;

        System.out.println("Gastos do primeiro trimestre: " + gastosTrimentre);
        System.out.println ("Valor da media mensal: " + mediaMensal);
    }
}
