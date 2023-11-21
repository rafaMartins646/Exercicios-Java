package Praticar;
import java.util.Scanner; 
public class SomaDosDoisAnteriores {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int[] numeros = new int[100]; 
	       
	        int contador = 0;
	        while (true) {

	            if (contador >= 2) {
	                int somaDosAnteriores = numeros[contador - 1] + numeros[contador - 2];
	                System.out.print("Digite um número (insira a soma dos dois anteriores para sair): ");
	                int numero = scanner.nextInt();

	                if (numero == somaDosAnteriores) {
	                    System.out.println("Número igual à soma dos dois anteriores inserido. Encerrando o programa.");
	                    break;
	                } else {
	                    System.out.println("O número inserido não é a soma dos dois anteriores. Tente novamente.");
	                }
	            } else {

	                System.out.print("Digite um número: ");
	                int numero = scanner.nextInt();
	                numeros[contador] = numero;
	                contador++;
	            }

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
