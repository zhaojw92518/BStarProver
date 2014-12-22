package cn.edu.buaa.act.bstar.context;

import java.util.LinkedList;

public class Restriction {
	private LinkedList<String> terms = new LinkedList<String>();
	
	public Restriction(String in_term) {
		terms.add(in_term);
	}
	
	public void merge(Restriction in_rttn){
		this.terms.addAll(in_rttn.terms);
	}
}
