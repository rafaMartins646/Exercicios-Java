package Praticar;
import java.util.Scanner;
public class DecimalParaBinario {
	 public static void main(String[] args) {
	     
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite um número decimal: ");
	        int decimal = scanner.nextInt();

	        String binario = decimalParaBinario(decimal);

	        System.out.println("O número binário correspondente é: " + binario);

	        scanner.close();
	    }

	    private static String decimalParaBinario(int decimal) {
	        if (decimal == 0) {
	            return "0";
	        }

	        StringBuilder binario = new StringBuilder();
	        while (decimal > 0) {
	            int resto = decimal % 2;
	            binario.insert(0, resto);
	            decimal /= 2;
	        }

	        return binario.toString();
	    }

}
