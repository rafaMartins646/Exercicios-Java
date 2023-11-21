package Praticar;


	import java.util.Scanner;
	import java.util.HashSet;

	public class arrayrepetido {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        HashSet<Integer> numerosLidos = new HashSet<>();
	        
	        int contador = 0;
	
	        int numero;
	        while (true) {
	            System.out.print("Digite um número: ");
	            numero = scanner.nextInt();
	     
	            if (numerosLidos.contains(numero)) {
	                break; 
	            }
	        
	            numerosLidos.add(numero);
	   
	            contador++;
	        }
	    
	        System.out.println("Foram inseridos " + contador + " número(s) antes da repetição.");

	        scanner.close();
	    }
	}


