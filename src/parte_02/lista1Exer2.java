public Class Condicional2.java{
                  int 7;
                  int i;
                  int numeroMultiplo;

                  System.out.println( " Digite a quantidade de multiplos:   ");
                 numeroMultiplo = entrada.nextInt( );
                   
                 for ( i=1; i <= numeroMultiplo; i++)
                  System.out.println ( 7 * i + " e multiplo de 7 ");


}

public Class Condicional3.java{
                  int aluno;
                  int i;
                  boolean Aprovacao = nota = 60;
                  System.out.println( Aprovacao);
                
                  System.out.println( " Digite o nome do aluno:   ");
                 nome = entrada.nextInt( );

                  System.out.println( " Digite a nota do aluno:   ");
                 nota = entrada.nextInt( );
                   
                 if( Aprovacao == true){

                  System.out.println ( nome  + " foi aprovado  ");
                 }

}

public Class Condicional4.java{ 

                  int aluno;
                  int i;
                  float nota, percAprovado;
                
                  System.out.println( " Digite o nome do aluno:   ");
                 nome = entrada.nextInt( );

                  System.out.println( " Digite a nota do aluno:   ");
                 nota = entrada.nextInt( );
                   
                 switch(nota){
                 case 90:
                 System.out.println("Conceito A");
                 case >80 && <89:
                 System.out.println("Conceito B");
                 case >70 && <79 :
                 System.out.println("Conceito C");
                 case >60 && <69:
                 System.out.println("Conceito D");
                 case >40 && <59 :
                 System.out.println("Conceito E");
                 case <40:
                 System.out.println("Conceito F");
                 default;
                 System.out.println("Opcao Invalida");
                  
                 }
}



public Class Condicional5.java{

                  int numero1;
                  int numero2;
                  

                 System.out.println( " Digite dois numeros para compara-los qual e o maior:   ");
                numero1 = entrada.nextInt( );
                numero2 = entrada.nextInt( );
                
               if (numero1 < numero2) {
               System.out.println( numero1 + " e maior:   ");
              } else{
              System.out.println( numero2 + " e maior:   ");
              }


}