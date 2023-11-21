package Praticar;
import java.util.Scanner;
public class Arraydenumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        System.out.print("Digite a quantidade de números: ");
        int tamanhoArray = scanner.nextInt();
       
        int[] numeros = new int[tamanhoArray];
   
        for (int i = 0; i < tamanhoArray; i++) {
            System.out.print("Digite o número #" + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }

        System.out.println("A soma dos números é: " + soma);
    
        scanner.close();
    }
}


