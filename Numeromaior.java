package Praticar;

import java.util.Scanner;

public class Numeromaior {
	public static void main(String[] args) {
	
	 Scanner scanner = new Scanner(System.in);
     int Numeromaior = Integer.MIN_VALUE; {
    	for (int i = 1; i <= 5; i++) {
         System.out.print("Digite o número #" + i + ": ");
         	int numero = scanner.nextInt();
         		if (numero > Numeromaior) {
         			Numeromaior = numero;
         }
     }
    		System.out.println("O maior número é: " + Numeromaior);

   
     scanner.close();
 }
}
}
