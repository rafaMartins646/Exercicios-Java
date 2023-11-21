package Praticar;
import java.time.LocalDate;
import java.time.Period;
public class Pessoa {
	  private int idade;
	    private String nome;
	    private LocalDate dataNascimento;

	    public Pessoa(String nome, int dia, int mes, int ano) {
	        this.nome = nome;
	        this.dataNascimento = LocalDate.of(ano, mes, dia);
	    }

	    public void calculaIdade(LocalDate dataAtual) {
	        Period periodo = Period.between(dataNascimento, dataAtual);
	        idade = periodo.getYears();
	    }

	    public int informaIdade() {
	        return idade;
	    }

	    public String informaNome() {
	        return nome;
	    }

	    public void ajustaDataDeNascimento(int dia, int mes, int ano) {
	        this.dataNascimento = LocalDate.of(ano, mes, dia);
	    }

	    public static void main(String[] args) {
	    
	        Pessoa einstein = new Pessoa("Albert Einstein", 14, 3, 1879);

	        Pessoa newton = new Pessoa("Isaac Newton", 4, 1, 1643);

	        LocalDate dataAtual = LocalDate.now();

	        einstein.calculaIdade(dataAtual);
	        newton.calculaIdade(dataAtual);

	        System.out.println("Albert Einstein teria " + einstein.informaIdade() + " anos hoje.");
	        System.out.println("Isaac Newton teria " + newton.informaIdade() + " anos hoje.");
	    }

}
