package com.model;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class MapDemo 
{
	
	public static void main(String[] args) 
	{
		
	    Map<Integer,String> hm=new TreeMap<Integer, String>();
		hm.put(4,"Avi");
		hm.put(1,"Avi");
		hm.put(10,"Ram");
		hm.put(1,"Abhi");
		
		for (Map.Entry e : hm.entrySet() )
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
	}

}
