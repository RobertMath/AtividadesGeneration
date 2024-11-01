package atividade.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Atividade1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<String>();

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite uma cor");
			cores.add(scanner.nextLine());
		}

		System.out.println("Listar todas as cores");
		for(String listaCores : cores) {
			System.out.println(listaCores);
		}
		
		Collections.sort(cores); // Collection.sort para ordernar a lista
		
		System.out.println("Ordenar as cores: ");
		for (String coresOrdenadas : cores) {
			System.out.println(coresOrdenadas);
			
		}
		scanner.close();
	}
}