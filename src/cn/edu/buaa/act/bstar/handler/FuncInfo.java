package cn.edu.buaa.act.bstar.handler;

import java.util.TreeMap;

public class FuncInfo {
	private TreeMap<Integer, Integer> label_map = new TreeMap<Integer, Integer>();
	private String func_name = null;
	private Integer begin = null, end = null;
	
	public FuncInfo(String in_name, Integer in_begin){
		func_name = in_name;
		begin = in_begin;
	}
	
	public String get_name(){
		return func_name;
	}
	
	public Integer get_begin(){
		return begin;
	}
	
	public void set_end(Integer in_end){
		end = in_end;
	}
	
	public Integer get_end(){
		return end;
	}
	
	public void insert_label(Integer label_num, Integer label_location){
		label_map.put(label_num, label_location);
	}
	
	public Integer get_label_loc(Integer label_num){
		Integer ret = label_map.get(label_num);
		return ret;
	}
}
