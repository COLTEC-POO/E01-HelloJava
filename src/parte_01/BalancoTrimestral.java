package parte_01;

public class BalancoTrimestral {

    public static void main (String[] args)
    {

        //declara os gastos
        double gastosJaneiro = 15000;
        double gastosFevereiro = 23000;
        double gastosMarco = 17000;

        //armazena os gastos total numa variavel
        double gastosTrimestre = gastosFevereiro + gastosJaneiro + gastosMarco;

        //printa os gastos total
        System.out.println(gastosTrimestre);

        //calcula a media dos gastos e armazena ela em uma variavel
        double mediaMensal = gastosTrimestre/3;

        //printa a media dos gastos
        System.out.println("Valor da média mensal: " + mediaMensal);
    }
}
