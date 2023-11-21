package Praticar;
import java.util.Scanner; 
public class Numeromenor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int quantidadedeNumeros = 10;
		int Numeromenor = Integer.MAX_VALUE;
		
		for(int i = 0; i < quantidadedeNumeros; i++) {
			System.out.print("Digite o numero " + (i + 1) + ": ");
			int numero = scanner.nextInt();
			
			if (numero < Numeromenor) {
				Numeromenor = numero;
			}
		}
		
		System.out.print("O menor numero digitado é: " + Numeromenor);
		
	}
}
	
	
	


