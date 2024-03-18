import java.util.Scanner;
public class Repeticao4 {
    
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int numero = scanner.nextInt();
		
		int fatorial = 1;
		int i = 1;
		while(i <= numero){
		    fatorial = fatorial * i;
		    i++;
		}
		System.out.printf("%d!: %d", numero, fatorial);
	}
}
//outra forma usando for:
// for(int i = 1; i <= numero; i++){
//       fatorial = fatorial * i;    
//  }
//      System.out.println(fatorial);
// }
