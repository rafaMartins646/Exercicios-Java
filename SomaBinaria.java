package Praticar;
import java.util.Scanner;
public class SomaBinaria {
	 public static void main(String[] args) {
	    
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o primeiro número binário: ");
	        String binario1 = scanner.nextLine();

	        System.out.print("Digite o segundo número binário: ");
	        String binario2 = scanner.nextLine();

	        int decimal1 = Integer.parseInt(binario1, 2);
	        int decimal2 = Integer.parseInt(binario2, 2);
	        int somaDecimal = decimal1 + decimal2;

	        String somaBinaria = Integer.toBinaryString(somaDecimal);

	        System.out.println("Soma em decimal: " + somaDecimal);
	        System.out.println("Soma em binário: " + somaBinaria);

	        scanner.close();
	    }
}
