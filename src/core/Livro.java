package core;

public class Livro implements Comparable<Livro>{
	
	public String nome;
	public double custo;
	
	public Livro(String nome, double custo) {
		this.nome = nome;
		this.custo = custo;
	}

	/**
	 *Esse método compara o preço de dois livros, e se a diferença de preço for menor que um determinado valor limite (0.001), 
	 *então, o resultado 0 será retornado, indicando que os dois livros têm o mesmo preço. 
	 *Essa comparação foi feita dessa forma pois a comparação de valores de ponto flutuante tem algumas limitações no computador. 
	 *Se o preço do livro corrente (atual) for maior do que o preço do livro passado como argumento, então, o resultado 1 será retornado, 
	 *caso contrário, se o preço do livro corrente for menor do que o preço do livro passado como argumento, o resultado -1 será retornado.  
	 *@return 0 se ambos os livros possuirem o mesmo preço.
	 *@return 1 se o livro passado como argumento for mais barato do que o livro corrente.
	 *@return -1 se o livro corrente for mais barato do que o livro passado como argumento
	 */
	@Override
	public int compareTo(Livro livro) {
		
		if (Math.abs(custo - livro.custo) < 0.001) {
			return 0;
		} else if (custo > livro.custo) {
			return 1;
		} else {
			return -1;
		}
	}
}
