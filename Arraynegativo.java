package Praticar;

import java.util.Scanner;

public class Arraynegativo {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	       
	        double soma = 0;
	     
	        int contador = 0;

	
	        while (true) {
	            System.out.print("Digite um número (insira um número negativo para sair): ");
	            double numero = scanner.nextDouble();

	        
	            if (numero < 0) {
	                break;
	            }

	        
	            soma += numero;
	            contador++;
	        }

	      
	        if (contador > 0) {
	            double media = soma / contador;
	            System.out.println("A média dos números inseridos é: " + media);
	        } else {
	            System.out.println("Nenhum número foi inserido.");
	        }

	      
	        scanner.close();
	    }
	}


