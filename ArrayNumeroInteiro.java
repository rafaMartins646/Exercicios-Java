package Praticar;
import java.util.Scanner;
public class ArrayNumeroInteiro {
	  
	private int[] array;
	    private int numeroAtualElementos;
	    private int tamanhoMaximo;

	    public ArrayNumeroInteiro(int tamanhoMaximo) {
	        this.tamanhoMaximo = tamanhoMaximo;
	        this.array = new int[tamanhoMaximo];
	        this.numeroAtualElementos = 0;
	    }

	    public boolean adicionar(int n) {
	        if (numeroAtualElementos < tamanhoMaximo) {
	            array[numeroAtualElementos++] = n;
	            return true;
	        } else {
	            System.out.println("O array está cheio. Não é possível adicionar mais elementos.");
	            return false;
	        }
	    }

	    public int calculaMedia() {
	        if (numeroAtualElementos == 0) {
	            System.out.println("O array está vazio. Não é possível calcular a média.");
	            return 0;
	        }

	        int soma = 0;
	        for (int i = 0; i < numeroAtualElementos; i++) {
	            soma += array[i];
	        }

	        return soma / numeroAtualElementos;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o tamanho do array: ");
	        int tamanhoArray = scanner.nextInt();

	        ArrayNumeroInteiro arrayNumeroInteiro = new ArrayNumeroInteiro(tamanhoArray);

	        for (int i = 0; i < tamanhoArray; i++) {
	            System.out.print("Digite o número " + (i + 1) + ": ");
	            int numero = scanner.nextInt();
	            arrayNumeroInteiro.adicionar(numero);
	        }

	        int media = arrayNumeroInteiro.calculaMedia();
	        System.out.println("A média dos números no array é: " + media);

	        scanner.close();
	    }
}
