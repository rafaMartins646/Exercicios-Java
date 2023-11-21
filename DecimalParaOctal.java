package Praticar;
import java.util.Scanner;
public class DecimalParaOctal {
	public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número decimal: ");
        int decimal = scanner.nextInt();

        String octal = decimalParaOctal(decimal);

        System.out.println("O número octal correspondente é: " + octal);

        scanner.close();
    }

    private static String decimalParaOctal(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        StringBuilder octal = new StringBuilder();
        while (decimal > 0) {
            int resto = decimal % 8;
            octal.insert(0, resto);
            decimal /= 8;
        }

        return octal.toString();
    }

}
