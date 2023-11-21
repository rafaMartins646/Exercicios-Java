package Praticar;
import java.util.Scanner;

	public class SalariosMinimos {
	    public static void main(String[] args) {
	     
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o valor do salário mínimo: ");
	        double salarioMinimo = scanner.nextDouble();

	        System.out.print("Digite o valor do salário do usuário: ");
	        double salarioUsuario = scanner.nextDouble();

	        double quantidadeSalariosMinimos = salarioUsuario / salarioMinimo;

	        System.out.println("O usuário ganha aproximadamente " + quantidadeSalariosMinimos + " salários mínimos.");

	        scanner.close();
	    }
}
