package Praticar;
import java.util.Scanner;
public class CalculadoraDeTroco {
	 public static void main(String[] args) {
	
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o valor total da compra: ");
	        double valorTotal = scanner.nextDouble();

	        System.out.print("Digite o valor pago pelo cliente: ");
	        double valorPago = scanner.nextDouble();

	        double troco = valorPago - valorTotal;

	        System.out.printf("Troco a ser devolvido: R$ %.2f%n", troco);

	        scanner.close();
	    }
}
