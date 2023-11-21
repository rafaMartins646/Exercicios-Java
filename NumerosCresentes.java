package Praticar;
import java.util.Scanner; 
public class NumerosCresentes {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	     
	        int[] numeros = new int[100]; 

	        
	        int contador = 0;
	        while (true) {
	            System.out.print("Digite um número (insira um número maior que o anterior para sair): ");
	            int numero = scanner.nextInt();

	          
	            if (contador > 0 && numero <= numeros[contador - 1]) {
	                System.out.println("Número não é maior que o anterior. Encerrando o programa.");
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


