package atividade.estrutura.de.dados.pilha;

import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Atividade1 {
	public static void main(String[] args) {
		Stack<String> pilhaLivros = new Stack<String>();
		Scanner scanner = new Scanner(System.in);
		Collections.addAll(pilhaLivros, "O Auto da Compadecida" , "O Alquimista", "Um Estudo em Vermelho");
		int opcao;
		
		
		do {
			
			System.out.println("######################################");
			System.out.println("\n1: Adicionar um novo livro na pilha. Deve solicitar o nome do livro.");
			System.out.println("\n2: Listar todos os livros da Pilha");
			System.out.println("\n3: Retirar um livro da pilha");
			System.out.println("\n0: O programa deve ser finalizado");
			System.out.println("######################################");
			System.out.println("\nEntre com a opção desejada: \n");
			opcao = scanner.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.println("\nDigite o nome: ");
				String adicionarLivro = scanner.next();
				pilhaLivros.push(adicionarLivro);
				System.out.printf("\nPilha: \n %s \n Livro adicionado!\n", adicionarLivro);
				break;
			case 2:
				System.out.println("\nLista de Livros na Pilha: \n");
				Iterator<String> iLista = pilhaLivros.iterator();
				while(iLista.hasNext()) {
					System.out.println(iLista.next());
				}
				break;
			case 3:
				pilhaLivros.pop();
				System.out.println("\nPilha\n");
				Iterator<String> iListaRemovendo = pilhaLivros.iterator();
				while(iListaRemovendo.hasNext()) {
					System.out.println(iListaRemovendo.next());
				}
				break;
			case 0:
				System.out.println("\nPrograma Finalizado!");
				break;
			default:
				System.out.println("\nSelecione uma opção válida.");
				break;				
			}	
		}while(opcao != 0);
			scanner.close();
	}
}
