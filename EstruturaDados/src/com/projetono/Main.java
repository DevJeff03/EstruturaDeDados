package com.projetono;

public class Main {
	public static void main(String[] args) {
		No<String> no1 = new No<>("Conteudo n01");
		No<String> no2 = new No<>("Conteudo n02");
		no1.setProximono(no2);
		No<String> no3 = new No<>("Conteudo n03");
		no2.setProximono(no3);
		No<String> no4 = new No<>("Conteudo n04");
		no3.setProximono(no4);
		
		System.out.println(no1);
		System.out.println(no1.getProximono());
		System.out.println(no2);
		
		System.out.println();
		
		System.out.println("----------------------------");
		
		System.out.println(no1);
		System.out.println(no1.getProximono());
		System.out.println(no1.getProximono().getProximono());
		System.out.println(no1.getProximono().getProximono().getProximono());
		System.out.println(no1.getProximono().getProximono().getProximono().getProximono());



	}
}
