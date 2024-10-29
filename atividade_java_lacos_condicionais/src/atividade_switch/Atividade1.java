package atividade_switch;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		//ler 6 opcoes
		//ler unidades compradas int
		//exibir quantidade, produto e valor
		
		Scanner sc = new Scanner(System.in);
		
		int x,y,preco,total;
		String produto = null;
		
		System.out.println("Qual o código do produto ?");
		x = sc.nextInt();
		
		preco = 0;

		switch(x) {
		case 1:
			produto = "Cachorro Quente";
			preco = 10;
			break;
		case 2:
			produto =  "X-salada";
			preco = 15;
			break;
		case 3:
			produto =  "X-bacon";
			preco = 18;
			break;
		case 4:
			produto = "Bauru";
			preco = 12;
			break;
		case 5:
			produto = "Refrigerante";
			preco = 8;
			break;
		case 6:
			produto = "Suco de Laranja";
			preco = 13;
			break;
		}
		
		System.out.println("Quantidade");
		y = sc.nextInt();
		
		total = preco * y;
		System.out.printf("Produto : %s",produto);
		System.out.printf("Valor Total: R$ %d ", total);
		sc.close();
		
		
	}
}
