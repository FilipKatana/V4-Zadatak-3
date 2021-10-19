package main;

import collections.ListaBrojeva;
import procesi.Potrosac;
import procesi.Proizvodjac;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		ListaBrojeva l = new ListaBrojeva(9);
		Proizvodjac pro = new Proizvodjac(l);
		Potrosac pot = new Potrosac(l);
		Thread t = new Thread(pro);
		Thread t2 = new Thread(pot);
		Thread t3 = new Thread(pro);
		Thread t4 = new Thread(pot);
		t.start();
		t2.start();
		t3.start();
		t4.start();
		t.join();
		t2.join();
		t3.join();
		t4.join();
		l.ispis();
		System.out.println("Dužina: " + l.duzina());
	}

}
