package parte_01;

public class BalancoTrimestral {

    public static void main(String[] args){

        int gastos_Janeiro = 15000;
        int gastos_Fevereiro = 23000;
        int gastos_Marco = 17000;

        int gastos_Trimestre = gastos_Janeiro + gastos_Fevereiro + gastos_Marco;

        System.out.printf("O gasto trimestral foi %d\n", gastos_Trimestre);

        float media_Mensal = (float) gastos_Trimestre/3;

        System.out.println("O valor da média mensal é de: "+ media_Mensal);
    }
}