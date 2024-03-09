package com.Set;

import java.util.*;

public class Main {
	public static void main(String[] args) {

		Set<Carro> hashSetCarros = new HashSet<>();
		
		hashSetCarros.add(new Carro("Chevrolet"));
		hashSetCarros.add(new Carro("BMW"));
		hashSetCarros.add(new Carro("Porche"));
		hashSetCarros.add(new Carro("Fiat"));
		hashSetCarros.add(new Carro("Ferrari"));
		hashSetCarros.add(new Carro("Tesla"));
		hashSetCarros.add(new Carro("Peugeot"));
		
		System.out.println(hashSetCarros);
		
		Set<Carro> treeSetCarros = new TreeSet<>();
		
		treeSetCarros.add(new Carro("Chevrolet"));
		treeSetCarros.add(new Carro("BMW"));
		treeSetCarros.add(new Carro("Porche"));
		treeSetCarros.add(new Carro("Fiat"));
		treeSetCarros.add(new Carro("Ferrari"));
		treeSetCarros.add(new Carro("Tesla"));
		treeSetCarros.add(new Carro("Peugeot"));
		
		System.out.println(treeSetCarros);

		
	}
}
