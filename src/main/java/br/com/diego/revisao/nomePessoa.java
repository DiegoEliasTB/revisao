package br.com.diego.revisao;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class nomePessoa {

	public static void main(String[] args) {
		String nome = "";
		List<String> nomes = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		
		Integer soma;
		
		while(!nome.equals("parar")) {
			System.out.print("Digite um nome: ");
			nome = scanner.next();
			nomes.add(count, nome);
			count++;
		}
		
		for(int i = 0; i < nomes.size() -1; i++) {
			System.out.println(nomes.get(i));
		}		
	}
}
