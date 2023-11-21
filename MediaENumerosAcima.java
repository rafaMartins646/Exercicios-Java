package Praticar;
import java.util.Scanner; 
public class MediaENumerosAcima {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int tamanhoArray = scanner.nextInt();

        double[] numeros = new double[tamanhoArray];

        for (int i = 0; i < tamanhoArray; i++) {
            System.out.print("Digite o número na posição " + i + ": ");
            numeros[i] = scanner.nextDouble();
        }

        double soma = 0;
        for (double numero : numeros) {
            soma += numero;
        }
        double media = soma / tamanhoArray;

        int acimaDaMedia = 0;
        for (double numero : numeros) {
            if (numero > media) {
                acimaDaMedia++;
            }
        }
       
        System.out.println("A média dos números é: " + media);
        System.out.println("Quantidade de números acima da média: " + acimaDaMedia);

        scanner.close();
    }

}
