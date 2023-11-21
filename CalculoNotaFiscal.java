package Praticar;
import java.util.Scanner;
public class CalculoNotaFiscal {
	 public static void main(String[] args) {
	     
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite a base de cálculo da nota fiscal: ");
	        double baseCalculo = scanner.nextDouble();

	        double icmsTaxa = 0.175;  // 17.5%
	        double ipiTaxa = 0.07;    // 7%
	        double pisTaxa = 0.0375;  // 3.75%
	        double cofinsTaxa = 0.04; // 4%

	        double icms = baseCalculo * icmsTaxa;
	        double ipi = baseCalculo * ipiTaxa;
	        double pis = baseCalculo * pisTaxa;
	        double cofins = baseCalculo * cofinsTaxa;

	        double valorTotal = baseCalculo + icms + ipi + pis + cofins;

	        System.out.printf("Valor do ICMS: R$ %.2f%n", icms);
	        System.out.printf("Valor do IPI: R$ %.2f%n", ipi);
	        System.out.printf("Valor do PIS: R$ %.2f%n", pis);
	        System.out.printf("Valor do COFINS: R$ %.2f%n", cofins);
	        System.out.printf("Valor total da nota fiscal: R$ %.2f%n", valorTotal);

	        scanner.close();
	    }

}
