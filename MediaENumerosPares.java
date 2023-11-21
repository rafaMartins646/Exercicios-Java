package Praticar;
import java.util.Scanner; 
public class MediaENumerosPares {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int soma = 0;
	        int quantidadeNumeros = 0;
	        int quantidadePares = 0;

	        while (true) {
	            System.out.print("Digite um número (insira um número negativo para sair): ");
	            int numero = scanner.nextInt();

	            if (numero < 0) {
	                break;
	            }

	            soma += numero;
	            quantidadeNumeros++;

	            if (numero % 2 == 0) {
	                quantidadePares++;
	            }
	        }

	        double media = quantidadeNumeros > 0 ? (double) soma / quantidadeNumeros : 0;

	        System.out.println("A média dos números inseridos é: " + media);
	        System.out.println("Quantidade de números pares: " + quantidadePares);

	        scanner.close();
	    }
	

}
