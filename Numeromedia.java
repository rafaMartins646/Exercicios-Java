package Praticar;
import java.util.Scanner;
public class Numeromedia { 

		public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        double soma = 0;

	        	for (int i = 1; i <= 10; i++) {
	            System.out.print("Digite o número #" + i + ": ");
	            double numero = scanner.nextDouble();

	            	soma += numero;
	        }
	        		double media = soma / 10;
	        		System.out.println("A média dos números é: " + media);

	      
	        scanner.close();
	    }
	}
