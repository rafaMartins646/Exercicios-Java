package Praticar;
import java.util.Scanner;
public class Sorteio {
	public static void main(String[] args) {
        sortearNumero();
    }

    public static void sortearNumero() {
        Scanner scanner = new Scanner(System.in);
        int numeroSorteado = (int) (Math.random() * 1001); 
        int tentativas = 0;

        System.out.println("Bem-vindo ao jogo de sorteio! Tente adivinhar o número entre 0 e 1000.");

        while (true) {
            System.out.print("Digite seu palpite: ");
            int palpite = scanner.nextInt();
            tentativas++;

            if (palpite == numeroSorteado) {
                System.out.println("Parabéns! Você acertou em " + tentativas + " tentativa(s).");
                break;
            } else if (palpite < numeroSorteado) {
                System.out.println("O número sorteado é maior. Tente novamente.");
            } else {
                System.out.println("O número sorteado é menor. Tente novamente.");
            }
        }

        scanner.close();
    }

}
