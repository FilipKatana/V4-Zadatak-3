package procesi;

import collections.ListaBrojeva;

public class Proizvodjac implements Runnable {

	private ListaBrojeva lista;
	
	
	public Proizvodjac(ListaBrojeva lista) {
		this.lista = lista;
	}
	
	
	@Override
	public void run() {
		int brojac = 20;
		try {
			while (brojac > 0) {
				double period = Math.random()*1000;
				Thread.sleep((long) period);
				System.out.println( Thread.currentThread().getName() + " čekao " + (int) period + " milisekundi");
				int element = (int) (Math.random()*100);
				synchronized (lista) {
					lista.dodaj(element);
				}
				--brojac;
			}
		} catch (InterruptedException e) {
			System.out.println("Došlo je do iznenadnog prekida pri izvršavanju niti proizvodjača!");
			e.printStackTrace();
		} 
	}

}
