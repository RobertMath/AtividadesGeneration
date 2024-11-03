package atividade.java.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Atividade1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashSet<Integer> numeros = new HashSet<Integer>();
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite o valor do numero");
			numeros.add(scanner.nextInt());
		}
		
		Iterator<Integer> iNumeros = numeros.iterator();
		
		System.out.println("Listar dados do Set: ");
		while(iNumeros.hasNext()) {
			System.out.println(iNumeros.next());
		}
		
		scanner.close();
	}
}
