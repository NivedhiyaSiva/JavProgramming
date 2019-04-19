package org.controlstatement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountOfString {
	public static void main(String[] args) {
		
		String name ="what is meant by selenium by testing";
	String[] c =	name.split(" ");
	System.out.println(c);
	//System.out.println(c.toString());
	//List<String> li = new ArrayList();
	Set<String> s = new HashSet<>();
List<String> li =	Arrays.asList(c);
System.out.println("count of set" + li.size());
s.addAll(li);

System.out.println("count of set" + s.size());
	
int k =li.size() - s.size();
System.out.println("the duplicate is" + k);
	}

}
