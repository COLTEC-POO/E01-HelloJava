public class repeticao {
 
    //Soma de 1 à 100
    public static void main(String[] args) {
 
        int sequencia = 0;
 
        System.out.print("Os valores entre 100 e 1000 são: ");
        for(int i = 100; i<=1000; i++)
            sequencia= i;
        System.out.println(sequencia);
}
 
public static void main(String[] args) {
 
        int soma = 0;
 
        System.out.print("A soma dos 100 e 1000: ");
        for(int i = 100; i<=1000; i++)
            soma += i;
            //soma = soma + i
        System.out.println(soma);
 
 
public static void main(String[]args){
	
	for(int i=1 ; i<=100 ; i++){
		if(i % 7 ==0){
			System.out.println(i);
		}
	}
}
 
 
public class calculeFatorial{
  public static void main(String[] args) {
    int fatorial = 1;
 
    for (int i = 1;i < 23 ; i ++ ) {
      fatorial *= i;
 
      System.out.println("Fatorial de " +i+"=" +fatorial);
    }
  }
}
