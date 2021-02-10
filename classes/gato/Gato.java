package gato;

public class Gato {

	private String nome;
	public 	String cor;
	private int    idade;

	public Gato(String nome, int idade, String cor) {
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String toString() {
		return "Nome: " + nome + ", Idade: " + idade + ", Cor: " + cor + "\n";
	}
}