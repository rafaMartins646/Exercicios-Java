package Praticar;
import java.util.Scanner;
public class NumeroPrimo {
	 public static boolean ehPrimo(int numero) {
	        if (numero <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(numero); i++) {
	            if (numero % i == 0) {
	                return false; 
	            }
	        }
	        return true; 
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int[] numeros = new int[100]; 

	        int contador = 0;
	        while (true) {
	            System.out.print("Digite um número (insira um número primo para sair): ");
	            int numero = scanner.nextInt();

	            if (ehPrimo(numero)) {
	                System.out.println("Número primo inserido. Encerrando o programa.");
	                break;
	            } else {
	                System.out.println("O número inserido não é primo. Tente novamente.");
	            }

	            numeros[contador] = numero;
	            contador++;

	            if (contador == numeros.length) {
	                System.out.println("Limite máximo de números atingido. Encerrando o programa.");
	                break;
	            }
	        }

	        System.out.println("Números inseridos:");
	        for (int i = 0; i < contador; i++) {
	            System.out.println(numeros[i]);
	        }

	        scanner.close();
	    }

}
