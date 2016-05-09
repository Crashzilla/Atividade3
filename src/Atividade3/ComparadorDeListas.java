package Atividade3;

import javax.swing.JOptionPane;

public class ComparadorDeListas {
	
	public static void main (String[] args){
	
		IeBListas comparador = new IeBListas();
		Integer tamanho = new Integer(JOptionPane.showInputDialog("Digite o tamanho da lista."));
		Integer posicao = new Integer(JOptionPane.showInputDialog("Digite a posi��o que deseja encontrar."));
		long diferenca;
		
		
		//COMPARANDO ARRAYLIST COM LINKEDLIST
		//INSER��O
		diferenca = comparador.arrayListInsercao(tamanho)-comparador.linkedListInsercao(tamanho);
		if(diferenca<0)
			System.out.println("ArrayList levou " + -diferenca + "ms a menos para inserir " + tamanho + " valores.");
		else if(diferenca>0)
			System.out.println("LinkedList levou " + diferenca + "ms a menos para inserir " + tamanho + " valores.");
		else
			System.out.println("Ambas as listas levaram o mesmo tempo para inserir" + tamanho + "valores");
		
		//BUSCA
		diferenca = comparador.arrayListBusca(posicao)-comparador.linkedListBusca(posicao);
		if(diferenca<0)
			System.out.println("ArrayList levou " + -diferenca + "ms a menos para buscar a posi��o " + posicao + ".");
		else if(diferenca>0)
			System.out.println("LinkedList levou " + diferenca + "ms a menos para buscar a posi��o " + posicao + ".");
		else
			System.out.println("Ambas as listas levaram o mesmo tempo para buscar a posi��o " + posicao + ".");
		
		System.out.println("--------------------------------------");
		
		//COMPARANDO STACK COM HASHSET
		//INSER��O
		diferenca = comparador.stackInsercao(tamanho)-comparador.hashSetInsercao(tamanho);
		if(diferenca<0)
			System.out.println("Stack levou " + -diferenca + "ms a menos para inserir " + tamanho + " valores.");
		else if(diferenca>0)
			System.out.println("HashSet levou " + diferenca + "ms a menos para inserir " + tamanho + " valores.");
		else
			System.out.println("Ambas as listas levaram o mesmo tempo para inserir" + tamanho + "valores");
				
		//BUSCA
		diferenca = comparador.stackBusca(posicao)-comparador.hashSetBusca(posicao);
		if(diferenca<0)
			System.out.println("Stack levou " + -diferenca + "ms a menos para buscar a posi��o " + posicao + ".");
		else if(diferenca>0)
			System.out.println("HashSet levou " + diferenca + "ms a menos para buscar a posi��o " + posicao + ".");
		else
			System.out.println("Ambas as listas levaram o mesmo tempo para buscar a posi��o " + posicao + ".");
		
		System.out.println("--------------------------------------");
		
		//COMPARANDO HASHMAP COM WEAKHASHMAP
		//INSER��O
		diferenca = comparador.hashMapInsercao(tamanho)-comparador.weakHashMapInsercao(tamanho);
		if(diferenca<0)
			System.out.println("HashMap levou " + -diferenca + "ms a menos para inserir " + tamanho + " valores.");
		else if(diferenca>0)
			System.out.println("WeakHashMap levou " + diferenca + "ms a menos para inserir " + tamanho + " valores.");
		else
			System.out.println("Ambas as listas levaram o mesmo tempo para inserir" + tamanho + "valores");
				
		//BUSCA
		diferenca = comparador.hashMapBusca(posicao)-comparador.weakHashMapBusca(posicao);
		if(diferenca<0)
			System.out.println("HashMap levou " + -diferenca + "ms a menos para buscar a posi��o " + posicao + ".");
		else if(diferenca>0)
			System.out.println("WeakHashMap levou " + diferenca + "ms a menos para buscar a posi��o " + posicao + ".");
		else
			System.out.println("Ambas as listas levaram o mesmo tempo para buscar a posi��o " + posicao + ".");
		
		
		//System.out.println(comparador.hashMapInsercao(tamanho));
		//System.out.println(comparador.hashMapBusca(posicao));
		//System.out.println(comparador.weakHashMapInsercao(tamanho));
		//System.out.println(comparador.weakHashMapBusca(posicao));
		
	}
}
