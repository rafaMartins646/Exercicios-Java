package Praticar;
import java.util.Scanner;
public class AbreviaturaNome {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o nome completo: ");
	        String nomeCompleto = scanner.nextLine();

	        String abreviatura = gerarAbreviatura(nomeCompleto);
	        System.out.println("Abreviatura: " + abreviatura);

	        scanner.close();
	    }

	    public static String gerarAbreviatura(String nomeCompleto) {
	        String[] palavras = nomeCompleto.split(" ");
	        StringBuilder abreviatura = new StringBuilder();

	        for (String palavra : palavras) {
	            if (palavra.length() > 2) {
	                abreviatura.append(palavra.charAt(0)).append(".");
	            } else {
	                abreviatura.append(palavra).append(" ");
	            }
	        }

	        return abreviatura.toString().trim(); 
	    }

}
