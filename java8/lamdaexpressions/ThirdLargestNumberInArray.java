package com.corejavaprojects.java8.lamdaexpressions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ThirdLargestNumberInArray {

	public static void main(String[] args) {

		int numbers[] = { 5, 78, 98, 56, 2, 12 };
		int thirdLargest = Arrays.stream(numbers).boxed().sorted((a, b) -> Integer.compare(b, a)).skip(2).findFirst()
				.orElseThrow(() -> new IllegalStateException("Wrong entries..."));
		System.out.println(thirdLargest);
		
		
		List<Integer> nums=Arrays.asList(5,9,2,8,3,10,7,4,1,6);
	int t=	nums.stream().sorted((a,b)->Integer.compare(b, a)).skip(3).findFirst().orElseThrow(()->new IllegalArgumentException());
	System.out.println(t);
	 Optional<Integer> m=	nums.stream().max((a,b)->Integer.max(b, a));
	 System.out.println(m);
	}

}
