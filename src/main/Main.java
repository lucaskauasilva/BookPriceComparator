package main;

import core.Livro;

public class Main {
	public static void main(String[] args) {
		
		Livro l1 = new Livro("Alice no País das Maravilhas", 38);
		Livro l2 = new Livro("O Senhor dos Anéis", 44);
		Livro l3 = new Livro("Harry Potter", 38);
		
		int compL1L2 = l1.compareTo(l2);
		System.out.println("\nComparação livro_1 e livro_2: " + compL1L2 + "\n");
		
		int compL1L3 = l1.compareTo(l3);
		System.out.println("\nComparação livro_1 e livro_3: " + compL1L3 + "\n");
		
		int compL2L3 = l2.compareTo(l3);
		System.out.println("\nComparação livro_2 e livro_3: " + compL2L3 + "\n");
	}
}
