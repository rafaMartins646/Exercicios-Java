package Praticar;
import java.util.Scanner;
public class SaldoComReajuste {
	
	    public static void main(String[] args) {
	      
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o saldo: ");
	        double saldo = scanner.nextDouble();

	        double saldoComReajuste = saldo * 1.01;

	        System.out.println("Saldo com reajuste de 1%: " + saldoComReajuste);

	        scanner.close();
	    }
}
