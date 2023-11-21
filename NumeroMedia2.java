package Praticar;
import java.util.Scanner;
public class NumeroMedia2 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        double soma = 0;
	        int quantidadeNumeros = 0;
	        double mediaAtual = 0;

	        System.out.print("Digite o tamanho do array: ");
	        int tamanhoArray = scanner.nextInt();

	        double[] numeros = new double[tamanhoArray];

	        while (true) {
	            System.out.print("Digite um número (ou -1 para sair): ");
	            double numero = scanner.nextDouble();

	            if (numero == -1) {
	            
	                break;
	            }

	            if (quantidadeNumeros < tamanhoArray) {
	               
	                numeros[quantidadeNumeros] = numero;
	                soma += numero;
	                quantidadeNumeros++;
	            } else {
	                System.out.println("Limite máximo de números atingido.");
	                break; 
	            }
	        }

	        if (quantidadeNumeros > 0) {
	            mediaAtual = soma / quantidadeNumeros;
	            System.out.println("A média dos números é: " + mediaAtual);

	            System.out.println("Números inseridos:");
	            for (int i = 0; i < quantidadeNumeros; i++) {
	                System.out.print(numeros[i] + " ");
	            }
	        } else {
	            System.out.println("Nenhum número inserido.");
	        }

	        scanner.close();
	    }

}
