package Praticar;
import java.util.Scanner;
public class MaiorNumeroEPosicao {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o tamanho do array: ");
	        int tamanhoArray = scanner.nextInt();

	        int[] numeros = new int[tamanhoArray];

	        for (int i = 0; i < tamanhoArray; i++) {
	            System.out.print("Digite o número na posição " + i + ": ");
	            numeros[i] = scanner.nextInt();
	        }

	        int maiorNumero = numeros[0];
	        int posicaoMaiorNumero = 0;

	        for (int i = 1; i < tamanhoArray; i++) {
	            if (numeros[i] > maiorNumero) {
	                maiorNumero = numeros[i];
	                posicaoMaiorNumero = i;
	            }
	        }

	        System.out.println("O maior número é: " + maiorNumero);
	        System.out.println("Posição no array: " + posicaoMaiorNumero);

	        scanner.close();
	    }

}
