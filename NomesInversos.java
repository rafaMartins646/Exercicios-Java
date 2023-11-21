package Praticar;

import java.util.ArrayList;
import java.util.Scanner;

public class NomesInversos {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        ArrayList<String> nomes = new ArrayList<>();

	        while (true) {
	            System.out.print("Digite um nome (insira 'FIM' para encerrar): ");
	            String nome = scanner.nextLine();

	            if (nome.equalsIgnoreCase("FIM")) {
	                break;
	            }

	            nomes.add(nome);
	        }
	        
	        System.out.println("Nomes em ordem inversa:");

	        for (int i = nomes.size() - 1; i >= 0; i--) {
	            System.out.println(nomes.get(i));
	        }

	        scanner.close();
	    }

}
