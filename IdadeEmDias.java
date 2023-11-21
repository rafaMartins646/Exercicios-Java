package Praticar;
import java.util.Scanner;
public class IdadeEmDias {
	 public static void main(String[] args) {
	      
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite a quantidade de anos: ");
	        int anos = scanner.nextInt();

	        System.out.print("Digite a quantidade de meses: ");
	        int meses = scanner.nextInt();

	        System.out.print("Digite a quantidade de dias: ");
	        int dias = scanner.nextInt();

	        int idadeEmDias = anos * 365 + meses * 30 + dias;

	        System.out.println("A idade em dias é: " + idadeEmDias);

	        scanner.close();
	    }
}
