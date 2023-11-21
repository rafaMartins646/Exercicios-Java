package Praticar;


	import java.util.Arrays;
	import java.util.Scanner;

	public class OrdenaNomes {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	     
	        String[] nomes = new String[5];

	     
	        for (int i = 0; i < 5; i++) {
	            System.out.print("Digite um nome: ");
	            nomes[i] = scanner.nextLine();
	        }

	   
	        Arrays.sort(nomes);

	
	        System.out.println("Nomes em ordem alfabética:");
	        for (String nome : nomes) {
	            System.out.println(nome);
	        }

	    
	        scanner.close();
	    }
	}


