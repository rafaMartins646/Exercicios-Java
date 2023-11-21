package Praticar;
import java.util.Scanner;
public class BinarioParaDecimal {
	 public static void main(String[] args) {
	      
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite um número binário: ");
	        String binario = scanner.nextLine();

	        int decimal = binarioParaDecimal(binario);

	        System.out.println("O número decimal correspondente é: " + decimal);

	        scanner.close();
	    }

	    private static int binarioParaDecimal(String binario) {
	        int decimal = 0;
	        int tamanho = binario.length() - 1;

	        for (int i = 0; i <= tamanho; i++) {
	            int digito = Character.getNumericValue(binario.charAt(i));
	            decimal += digito * Math.pow(2, tamanho - i);
	        }

	        return decimal;
	    }

}
