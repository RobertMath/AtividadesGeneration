package atividade.java.collections.list;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
		
		listaNumeros.add(2);
		listaNumeros.add(5);
		listaNumeros.add(1);
		listaNumeros.add(3);
		listaNumeros.add(4);
		listaNumeros.add(9);
		listaNumeros.add(7);
		listaNumeros.add(8);
		listaNumeros.add(10);
		listaNumeros.add(6);
		//procura um valor dentro da Arraylist e retorna a posicao do index 
		System.out.println("Digite o número que você deseja encontrar:");
		int  numeroDigitado = scanner.nextInt();
		
		if(listaNumeros.contains(numeroDigitado)) {
			System.out.printf("O número %d está localizado na posição: %d", numeroDigitado , listaNumeros.indexOf(numeroDigitado) );
		}else {
			System.out.printf("O número %d não foi encontrado! ", numeroDigitado);
		}
		
	
	}
}
