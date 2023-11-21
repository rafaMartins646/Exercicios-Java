package Praticar;
import java.util.Scanner;
public class MenorNumeroEPosicao {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int tamanhoArray = scanner.nextInt();

        int[] numeros = new int[tamanhoArray];

        for (int i = 0; i < tamanhoArray; i++) {
            System.out.print("Digite o número na posição " + i + ": ");
            numeros[i] = scanner.nextInt();
        }

        int menorNumero = numeros[0];
        int posicaoMenorNumero = 0;

        for (int i = 1; i < tamanhoArray; i++) {
            if (numeros[i] < menorNumero) {
                menorNumero = numeros[i];
                posicaoMenorNumero = i;
            }
        }

        System.out.println("O menor número é: " + menorNumero);
        System.out.println("Posição no array: " + posicaoMenorNumero);

        scanner.close();
    }

}
