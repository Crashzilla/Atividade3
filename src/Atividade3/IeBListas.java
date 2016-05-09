package Atividade3;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;
import java.util.WeakHashMap;

public class IeBListas {

	ArrayList<Integer> arrayList;
	LinkedList<Integer> linkedList;
	Stack<Integer> stack;
	HashSet<Integer> hashSet;
	HashMap<Integer, Integer> hashMap;
	WeakHashMap<Integer, Integer> weakHashMap;
	
	//ARRAYLIST
	public long arrayListInsercao (int valor){
		
		this.arrayList = new ArrayList<>();
		
		LocalDateTime inicio = LocalDateTime.now();
		
		for (int i=0; i<valor; i++){
			this.arrayList.add(i);
		}
		
		LocalDateTime fim = LocalDateTime.now();
		
		long tempoInsercao = ChronoUnit.MILLIS.between(inicio, fim);
		
		return tempoInsercao;
	}
	
	public long arrayListBusca (int valor){
		
		LocalDateTime inicio = LocalDateTime.now();
				
		this.arrayList.get(valor);
				
		LocalDateTime fim = LocalDateTime.now();
				
		long tempoBusca = ChronoUnit.MILLIS.between(inicio, fim);
		
		this.arrayList.clear();
		
		return tempoBusca;
	}
	
	//LINKEDLIST
	public long linkedListInsercao (int valor){
		
		this.linkedList = new LinkedList<>();
		
		LocalDateTime inicio = LocalDateTime.now();
		
		for (int i=0; i<valor; i++){
			this.linkedList.add(i);
		}
		
		LocalDateTime fim = LocalDateTime.now();
		
		long tempoInsercao = ChronoUnit.MILLIS.between(inicio, fim);
		
		return tempoInsercao;
	}
	
	public long linkedListBusca (int valor){
		
		LocalDateTime inicio = LocalDateTime.now();
				
		this.linkedList.get(valor);
				
		LocalDateTime fim = LocalDateTime.now();
				
		long tempoBusca = ChronoUnit.MILLIS.between(inicio, fim);
		this.linkedList.clear();
		return tempoBusca;
	}
	
	//STACK
	public long stackInsercao (int valor){
		
		this.stack = new Stack<>();
		
		LocalDateTime inicio = LocalDateTime.now();
		
		for (int i=0; i<valor; i++){
			this.stack.push(i);
		}
		
		LocalDateTime fim = LocalDateTime.now();
		
		long tempoInsercao = ChronoUnit.MILLIS.between(inicio, fim);
		
		return tempoInsercao;
	}
	
	public long stackBusca (int valor){
		
		LocalDateTime inicio = LocalDateTime.now();
				
		this.stack.search(valor);
				
		LocalDateTime fim = LocalDateTime.now();
				
		long tempoBusca = ChronoUnit.MILLIS.between(inicio, fim);
		this.stack.clear();		
		return tempoBusca;
	}
	
	//HASHSET
	public long hashSetInsercao (int valor){
		
		this.hashSet = new HashSet<>();
		
		LocalDateTime inicio = LocalDateTime.now();
		
		for (int i=0; i<valor; i++){
			this.hashSet.add(i);
		}
		
		LocalDateTime fim = LocalDateTime.now();
		
		long tempoInsercao = ChronoUnit.MILLIS.between(inicio, fim);
		
		return tempoInsercao;
	}
	
	public long hashSetBusca (int valor){
		
		LocalDateTime inicio = LocalDateTime.now();
				
		this.hashSet.contains(valor);
				
		LocalDateTime fim = LocalDateTime.now();
				
		long tempoBusca = ChronoUnit.MILLIS.between(inicio, fim);
		this.hashSet.clear();
		return tempoBusca;
	}
	
	//HASHMAP
	public long hashMapInsercao (int valor){
			
		this.hashMap = new HashMap<>();
			
		LocalDateTime inicio = LocalDateTime.now();
			
		for (int i=0; i<valor; i++){
			this.hashMap.put(i, i);
		}
			
		LocalDateTime fim = LocalDateTime.now();
			
		long tempoInsercao = ChronoUnit.MILLIS.between(inicio, fim);
			
		return tempoInsercao;
	}
		
	public long hashMapBusca (int valor){
			
		LocalDateTime inicio = LocalDateTime.now();
					
		this.hashMap.get(valor);
					
		LocalDateTime fim = LocalDateTime.now();
					
		long tempoBusca = ChronoUnit.MILLIS.between(inicio, fim);
		this.hashMap.clear();
		return tempoBusca;
	}
		
		//WEAKHASHMAP
	public long weakHashMapInsercao (int valor){
					
		this.weakHashMap = new WeakHashMap<>();
					
		LocalDateTime inicio = LocalDateTime.now();
					
		for (int i=0; i<valor; i++){
			this.weakHashMap.put(i, i);
		}
					
		LocalDateTime fim = LocalDateTime.now();
					
		long tempoInsercao = ChronoUnit.MILLIS.between(inicio, fim);
					
		return tempoInsercao;
	}
				
	public long weakHashMapBusca (int valor){
					
		LocalDateTime inicio = LocalDateTime.now();
							
		this.weakHashMap.get(valor);
							
		LocalDateTime fim = LocalDateTime.now();
							
		long tempoBusca = ChronoUnit.MILLIS.between(inicio, fim);
		this.weakHashMap.clear();					
		return tempoBusca;
	}
}
