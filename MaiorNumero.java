package Praticar;
import java.util.Scanner;
public class MaiorNumero {
	public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        int maior = Integer.MIN_VALUE;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = scanner.nextInt();

            if (numero > maior) {
                maior = numero;
            }
        }

        scanner.close();

        System.out.println("O maior número digitado é: " + maior);
    }

}
