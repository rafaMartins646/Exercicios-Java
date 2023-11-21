package Praticar;
import java.util.Scanner; 
public class Arrayloop {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        java.util.ArrayList<Integer> numeros = new java.util.ArrayList<>();
	        
	        int numero;
	        do {
	            System.out.print("Digite um número (insira 0 para parar): ");
	            numero = scanner.nextInt();

	            if (numero != 0) {
	                numeros.add(numero);
	            }

	        } while (numero != 0);
	        
	        int quantidadeNumeros = numeros.size();
	        System.out.println("Foram inseridos " + quantidadeNumeros + " número(s) antes da repetição.");

	        scanner.close();
	    }
	}


