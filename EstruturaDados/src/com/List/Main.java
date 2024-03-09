package com.List;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		List<Carro> listaCarros = new ArrayList<>();
		
		listaCarros.add(new Carro("Ford"));
		listaCarros.add(new Carro("BMW"));
		listaCarros.add(new Carro("Fiat"));
		listaCarros.add(new Carro("Peugeot"));
		
		System.out.println(listaCarros.contains(new Carro("Ford")));
		
		System.out.println(listaCarros.get(2));
		
		System.out.println(listaCarros.indexOf(new Carro("BMW")));
		
		System.out.println(listaCarros.remove(1));
		System.out.println();

		
		for(int i = 0; i < listaCarros.size(); i++) {
			System.out.println(listaCarros.get(i));

		}




		
		
	}
}
