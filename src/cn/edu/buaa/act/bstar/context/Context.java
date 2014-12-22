package cn.edu.buaa.act.bstar.context;

import java.util.LinkedList;
import java.util.TreeMap;

public class Context {
	private TreeMap<String, Restriction> restrictions = new TreeMap<String, Restriction>();
	
	public void add_restriction(Restriction in_rttn, LinkedList<String> key_words){
		for(String cur_key : key_words){
			Restriction cur_rttn = restrictions.get(cur_key);
			cur_rttn.merge(in_rttn);
		}
	}
}
