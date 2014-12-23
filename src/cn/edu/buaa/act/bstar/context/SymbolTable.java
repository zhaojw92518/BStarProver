package cn.edu.buaa.act.bstar.context;

import java.util.LinkedList;
import java.util.TreeMap;

public class SymbolTable {
	private TreeMap<String, Restriction> restrictions = new TreeMap<String, Restriction>();
	
	public void add_rttn(Restriction in_rttn, LinkedList<String> key_words){
		for(String cur_key : key_words){
			Restriction cur_rttn = restrictions.get(cur_key);
			cur_rttn.merge(in_rttn);
		}
	}
	
	public Restriction get_rttn(String in_name){
		Restriction ret = null;
		ret = restrictions.get(in_name);
		return ret;
	}
}
