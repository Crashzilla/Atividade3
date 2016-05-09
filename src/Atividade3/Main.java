package Atividade3;

import java.io.LineNumberInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.List;

public class Main {
	
	public static void main (String[] args){
		
		ArrayList<Pessoa> listaPessoa = new ArrayList();
		
		Pessoa pessoa1 = new Pessoa("João Garcia", 20, 'M', "AIK Enterprises");
		Pessoa pessoa2 = new Pessoa("Maria Martins", 44, 'F', "Simples");
		Pessoa pessoa3 = new Pessoa("Henrique Fernando", 43, 'M', "AIK Enterprises");
		Pessoa pessoa4 = new Pessoa("Inácio Luís", 33, 'M', "Magazine André");
		Pessoa pessoa5 = new Pessoa("Fernando Ferreira", 87, 'M', "Casas Recife");
		
		listaPessoa.add(pessoa1);
		listaPessoa.add(pessoa2);
		listaPessoa.add(pessoa3);
		listaPessoa.add(pessoa4);
		listaPessoa.add(pessoa5);
				
		Collections.shuffle(listaPessoa);
		Pessoa pessoa = listaPessoa.get(0);
		System.out.println(pessoa.getNome());
		System.out.println("------------------------");
		
		Collections.sort(listaPessoa, new Comparator<Pessoa>() {

			@Override
			public int compare(Pessoa arg0, Pessoa arg1) {
				// TODO Auto-generated method stub
				return arg0.nome.compareTo(arg1.nome);
			}
		});
		listaPessoa.forEach(p -> System.out.println(p.getNome()));
		System.out.println("------------------------");
		
		Collections.reverse(listaPessoa);
		listaPessoa.forEach(p -> System.out.println(p.getNome()));
		
	}
}
