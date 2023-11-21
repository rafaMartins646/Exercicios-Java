package Praticar;
import java.util.Scanner;
public class CifraDeCesar {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite a mensagem: ");
	        String mensagem = scanner.nextLine();

	        System.out.print("Digite o valor de K: ");
	        int k = scanner.nextInt();

	        String mensagemCriptografada = cifraDeCesar(mensagem, k);
	        System.out.println("Mensagem criptografada: " + mensagemCriptografada);

	        scanner.close();
	    }

	    public static String cifraDeCesar(String mensagem, int k) {
	        StringBuilder mensagemCriptografada = new StringBuilder();

	        for (char caractere : mensagem.toCharArray()) {
	            if (Character.isLetter(caractere)) {
	                char inicioAlfabeto = Character.isUpperCase(caractere) ? 'A' : 'a';
	                char novoCaractere = (char) ((caractere - inicioAlfabeto + k) % 26 + inicioAlfabeto);
	                mensagemCriptografada.append(novoCaractere);
	            } else {
	                mensagemCriptografada.append(caractere);
	            }
	        }

	        return mensagemCriptografada.toString();
	    }
}
