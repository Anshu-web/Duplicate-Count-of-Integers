package com.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Test1 {
	
	public static void main(String[] args) {
		
		int [] arr= {8,9,10,9,8,10,11,5,0,2};
		
		StringBuffer sb=new StringBuffer();
		Set<Integer> set=new HashSet<>();
		
		for(int i=0;i<arr.length;i++)
		{
		
		if(!set.contains(arr[i]))
		{
			
			set.add(arr[i]);
			sb.append(arr[i]+" ");//git push --force origin master//2306901017731
		}
		
		}
		
		System.out.println(sb);
		
		System.out.println("=====================================");
		
		
		
		HashMap<Integer, Integer> h=new HashMap<>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(h.containsKey(arr[i]))
			{
				h.put(arr[i], h.get(arr[i])+1);
			}
			else
			{
				h.put(arr[i], 1);
			}
		}
		
		//System.out.println(h);
		
		Iterator itr=h.entrySet().iterator();
		
		while (itr.hasNext()) {
			Entry<Integer, Integer> entry = (Entry<Integer, Integer>) itr.next();
			
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+ " "+entry.getValue());
			}
			
		}
		
	}
	
	
	
	

}
