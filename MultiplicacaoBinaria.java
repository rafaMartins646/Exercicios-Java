package Praticar;
import java.util.Scanner;
public class MultiplicacaoBinaria {
	 public static void main(String[] args) {
	     
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o primeiro número binário: ");
	        String binario1 = scanner.nextLine();

	        System.out.print("Digite o segundo número binário: ");
	        String binario2 = scanner.nextLine();

	        int decimal1 = Integer.parseInt(binario1, 2);
	        int decimal2 = Integer.parseInt(binario2, 2);
	        int produtoDecimal = decimal1 * decimal2;

	        String produtoBinario = Integer.toBinaryString(produtoDecimal);

	        System.out.println("Produto em decimal: " + produtoDecimal);
	        System.out.println("Produto em binário: " + produtoBinario);

	        scanner.close();
	    }

}
