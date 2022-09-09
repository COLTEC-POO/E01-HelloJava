public class Condicional4 {

    int aluno;
    int nota;
    int i;
    System.out.println("Digite o nome do aluno:  ");
    aluno=entrada.nextInt( );

    System.out.println("Digite a nota do aluno:  ");

    switch (nota){
        case 90:
            System.out.println("Conceito A");
        case >80 || <89:
            System.out.println("Conceito B");
        case >70 || <79:
            System.out.println("Conceito C");
        case >60 || <69:
            System.out.println("Conceito D");
        case >40 || <59:
            System.out.println("Conceito E");
        case >40:
            System.out.println("Conceito F");
            default;
            System.out.println("Opcap Invalida!");
    }

}
