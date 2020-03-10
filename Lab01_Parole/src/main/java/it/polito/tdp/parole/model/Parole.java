package it.polito.tdp.parole.model;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Parole {
	
	private LinkedList<String> parole = new LinkedList<String>();
		
	public Parole() {
		//TODO
	}
	
	public void addParola(String p) {
		parole.add(p);
	}
	
	public List<String> getElenco() {
		Collections.sort(parole, new ComparatoreParoleAlfa());
		return parole;
	}
	
	public void reset() {
	parole.clear();
	}
	public void CancellaParola(String s) {
		parole.remove(s);
	}

}
