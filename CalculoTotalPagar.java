package Praticar;
import java.util.Scanner;
public class CalculoTotalPagar {
	 public static void main(String[] args) {
	       
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite a porcentagem do IPI: ");
	        double ipi = scanner.nextDouble();

	        System.out.print("Digite o código da peça 1: ");
	        int codigo1 = scanner.nextInt();
	        System.out.print("Digite o valor unitário da peça 1: ");
	        double valor1 = scanner.nextDouble();
	        System.out.print("Digite a quantidade de peças 1: ");
	        int quantidade1 = scanner.nextInt();

	        System.out.print("Digite o código da peça 2: ");
	        int codigo2 = scanner.nextInt();
	        System.out.print("Digite o valor unitário da peça 2: ");
	        double valor2 = scanner.nextDouble();
	        System.out.print("Digite a quantidade de peças 2: ");
	        int quantidade2 = scanner.nextInt();

	        double totalPagar = (valor1 * quantidade1 + valor2 * quantidade2) * (ipi / 100 + 1);

	        System.out.println("Código da peça 1: " + codigo1);
	        System.out.println("Valor unitário da peça 1: " + valor1);
	        System.out.println("Quantidade de peças 1: " + quantidade1);
	        System.out.println("Código da peça 2: " + codigo2);
	        System.out.println("Valor unitário da peça 2: " + valor2);
	        System.out.println("Quantidade de peças 2: " + quantidade2);
	        System.out.println("Valor total a ser pago: " + totalPagar);

	        scanner.close();
	    }

}
