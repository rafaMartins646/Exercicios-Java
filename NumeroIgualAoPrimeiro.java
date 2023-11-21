package Praticar;
import java.util.Scanner; 
public class NumeroIgualAoPrimeiro {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int[] numeros = new int[100]; 

	        System.out.print("Digite o primeiro número: ");
	        int primeiroNumero = scanner.nextInt();

	        numeros[0] = primeiroNumero;

	        int contador = 1;
	        while (true) {
	            System.out.print("Digite um número (insira um número igual ao primeiro para sair): ");
	            int numero = scanner.nextInt();

	            if (numero == primeiroNumero) {
	                System.out.println("Número igual ao primeiro inserido. Encerrando o programa.");
	                break;
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
