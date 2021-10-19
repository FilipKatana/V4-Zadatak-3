package procesi;

import collections.ListaBrojeva;

public class Potrosac implements Runnable {
	ListaBrojeva lista;
	
	public Potrosac(ListaBrojeva lista) {
		this.lista = lista;
	}

	@Override
	public void run() {
		int duzina;
		synchronized (lista) {
			duzina = this.lista.duzina();
		}
		
		while (duzina > 0) {
			//System.out.println("Potrošač heartbeat");
			synchronized (lista) {
				duzina = this.lista.duzina();
				if (duzina >= 1) {
					this.lista.ukloni(duzina - 1);
				}
				
			}
		}
		
	}
	
	
	
}
