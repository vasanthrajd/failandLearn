package com.pack1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
public class Demo1 {
public static void main(String[] args){
	Set<String> set=new TreeSet<String>();
	set.add("tom");
	set.add("ram");
	set.add("ravi");
	set.add("rao");
	set.add("matt");
	set.add("tom");
	for(String str: set){
		System.out.println(str);
	}
	
	
	
	
}
}
