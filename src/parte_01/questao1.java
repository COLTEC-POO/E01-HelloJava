    package parte_01;

    import java.util.Scanner;

    public class questao1 {

        public static void main(String[] args)
        {
            int gasto_janeiro = 15000;
            int gasto_fevereiro = 23000;
            int gasto_marco = 17000;
            float gasto_trimestre = 0;
            float media = 0;

            gasto_trimestre = gasto_janeiro + gasto_fevereiro + gasto_marco ;

            System.out.printf("o gasto trimestral eh igual a : %f\n",gasto_trimestre);

            media = gasto_trimestre/3;

            System.out.printf("a media mensal do trimestre foi = " + media);
        }

    }