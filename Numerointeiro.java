package Praticar;
import java.util.Scanner;
public class Numerointeiro {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        System.out.println("Os divisores de " + numero + " são:");
        
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}


