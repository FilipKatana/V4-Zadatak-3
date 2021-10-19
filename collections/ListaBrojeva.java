package collections;

import java.util.ArrayList;

public class ListaBrojeva {
	private ArrayList<Integer> lista = new ArrayList<Integer>();
	
	public ListaBrojeva(int ...lista) {
		for (int i : lista) {
			this.lista.add(i);
		}
	}
	
	public void dodaj(int i) {
		this.lista.add(i);
	}
	
	public void ukloni(int i) {
		this.lista.remove(i);
	}
	
	public int duzina() {
		return this.lista.size();
	}
	
	public void ispis() {
		for (int i : this.lista) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
