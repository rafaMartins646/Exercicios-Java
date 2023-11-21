package Praticar;
import java.util.Scanner;
public class DecimalParaHexadecimal {
	 public static void main(String[] args) {
	     
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite um número decimal: ");
	        int decimal = scanner.nextInt();

	        String hexadecimal = decimalParaHexadecimal(decimal);

	        System.out.println("O número hexadecimal correspondente é: " + hexadecimal);

	        scanner.close();
	    }

	    private static String decimalParaHexadecimal(int decimal) {
	        if (decimal == 0) {
	            return "0";
	        }

	        StringBuilder hexadecimal = new StringBuilder();
	        while (decimal > 0) {
	            int resto = decimal % 16;
	            hexadecimal.insert(0, obterCaractereHexadecimal(resto));
	            decimal /= 16;
	        }

	        return hexadecimal.toString();
	    }

	    private static char obterCaractereHexadecimal(int resto) {
	        if (resto < 10) {
	            return (char) ('0' + resto);
	        } else {
	            return (char) ('A' + resto - 10);
	        }
	    }

}
