package it.polito.tdp.parole.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ParoleArrayList {
	
	private ArrayList<String> parole = new ArrayList<String>();
		
	public ParoleArrayList() {
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