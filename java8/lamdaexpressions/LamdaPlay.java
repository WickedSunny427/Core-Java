package com.corejavaprojects.java8.lamdaexpressions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LamdaPlay {

	public static void main(String[] args) {

	List<Integer> numbers=Arrays.asList(20,30,35,77,12,98,90,41);
	
	List<Integer> even= numbers.stream().filter(i->i%2==0).collect(Collectors.toList());
	System.out.println(even);
	
	List<Integer> odd= numbers.stream().filter(i->i%2!=0).collect(Collectors.toList());
	System.out.println(odd);
	
	List<String> students=Arrays.asList("Sunny","Akash","Shikhar","Sunidhi","Aishwarya");
	List<String> studentUpper=	students.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
	System.out.println(studentUpper);
	}
}