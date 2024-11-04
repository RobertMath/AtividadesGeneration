package atividade.estrutura.de.dados.fila;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atividade1 {
	public static void main(String[] args) {
		Queue<String> listaPessoas = new LinkedList<>();
		Scanner scanner = new Scanner(System.in);
		Collections.addAll(listaPessoas, "João", "Maria", "Ana");
		int opcao;
		
		do {
		System.out.println("######################################");
		System.out.println("\n1: Adicionar um novo Cliente na fila. ");
		System.out.println("\n2: Listar todos os Clientes na fila ");
		System.out.println("\n3: Chamar (retirar) uma pessoa da fila ");
		System.out.println("\n0: O programa deve ser finalizado. ");
		System.out.println("######################################");
		System.out.println("Entre com a opção desejada: ");
		 opcao = scanner.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("Digite o nome: \n");
			String adicionarPessoa = scanner.next();
			listaPessoas.add(adicionarPessoa);
			System.out.printf("Fila :\n  %s \n Cliente Adicionado!\n", adicionarPessoa);

			break;
		case 2:
			System.out.println("Lista de clientes na fila: \n");
			Iterator<String> iListaPessoas = listaPessoas.iterator();
			while (iListaPessoas.hasNext()) {
				System.out.println(iListaPessoas.next());
			}
			break;
		case 3:
			System.out.println("Fila: \n");
			listaPessoas.remove();
			Iterator<String> iRemovendoPessoas = listaPessoas.iterator();
			while (iRemovendoPessoas.hasNext()) {
				System.out.println(iRemovendoPessoas.next());
			}
			break;
		case 0:
			System.out.println("Programa Finalizado!");
			break;
		default:
			System.out.println("Digite uma opção válida");
			break;
		}
		}while(opcao != 0);

		scanner.close();

	}
}
