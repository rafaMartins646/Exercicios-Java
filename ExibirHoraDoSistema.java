package Praticar;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExibirHoraDoSistema {
	   public static void main(String[] args) {
	      
	        LocalDateTime horaAtual = LocalDateTime.now();

	        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");

	        String horaFormatada = horaAtual.format(formatoHora);
	        System.out.println("A hora do sistema é: " + horaFormatada);
	    }
			

}
