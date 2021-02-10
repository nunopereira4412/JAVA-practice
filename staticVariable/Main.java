public class Main {

	private int idade = 0;
	static String nome = "original";

	public static void main(String[] args) {

		Main obj1 = new Main();
		Main obj2 = new Main();

		System.out.println("1: " + obj1.idade + ", " + obj1.nome);
		System.out.println("2: " + obj2.idade + ", " + obj2.nome);

		obj2.idade = 1;
		obj2.setNome("teste");

		System.out.println("1: " + obj1.idade + ", " + obj1.nome);
		System.out.println("2: " + obj2.idade + ", " + obj2.nome);
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}