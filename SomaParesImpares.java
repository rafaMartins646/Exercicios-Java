package Praticar;
import java.util.Scanner;

public class SomaParesImpares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaPares = 0;
        int somaImpares = 0;

        while (true) {
            System.out.print("Digite um número (insira 999 para sair): ");
            int numero = scanner.nextInt();

            if (numero == 999) {
                break; 
            }

            if (numero % 2 == 0) {
                somaPares += numero;
            } else {
                somaImpares += numero;
            }
        }

        System.out.println("A soma dos números pares é: " + somaPares);
        System.out.println("A soma dos números ímpares é: " + somaImpares);

       
        scanner.close();
    }
}