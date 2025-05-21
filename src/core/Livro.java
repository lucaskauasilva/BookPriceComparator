package core;

public class Livro implements Comparable<Livro>{
	
	public String nome;
	public double custo;
	
	public Livro(String nome, double custo) {
		this.nome = nome;
		this.custo = custo;
	}

	/**
	 *Esse método compara o preço de dois livros através da diferença entre seus valores.
	 *@return 0 se ambos os livros possuirem o mesmo preço.
	 *@return 1 se o livro passado como argumento for mais barato do que o livro corrente.
	 *@return -1 se o livro corrente for mais barato do que o livro passado como argumento
	 */
	@Override
	public int compareTo(Livro livro) {
		
		if (Math.abs(custo - livro.custo) < 0.001) {
			System.out.printf("Ambos os livros '%s' e '%s' possuem o mesmo valor. ", this.nome, livro.nome);
			return 0;
		} else if (custo > livro.custo) {
			System.out.printf("O Livro '%s' está mais barato do que o Livro '%s'. ", livro.nome, this.nome);
			return 1;
		} else {
			System.out.printf("O Livro '%s' está mais barato do que o Livro '%s'. ", this.nome, livro.nome);
			return -1;
		}
	}
}
