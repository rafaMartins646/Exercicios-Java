package Praticar;
import java.util.Scanner; 
public class SegundoMaiorNumero {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o tamanho do array: ");
	        int tamanhoArray = scanner.nextInt();

	        if (tamanhoArray < 2) {
	            System.out.println("O array deve ter pelo menos dois elementos para encontrar o segundo maior número.");
	            return;
	        }

	        int[] numeros = new int[tamanhoArray];

	        for (int i = 0; i < tamanhoArray; i++) {
	            System.out.print("Digite o número na posição " + i + ": ");
	            numeros[i] = scanner.nextInt();
	        }

	        int maior = Integer.MIN_VALUE;
	        int segundoMaior = Integer.MIN_VALUE;

	        for (int numero : numeros) {
	            if (numero > maior) {
	                segundoMaior = maior;
	                maior = numero;
	            } else if (numero > segundoMaior && numero < maior) {
	                segundoMaior = numero;
	            }
	        }

	        System.out.println("O segundo maior número é: " + segundoMaior);

	        scanner.close();
	    }
}
