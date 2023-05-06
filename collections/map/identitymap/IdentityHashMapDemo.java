package com.corejavaprojects.collections.map.identitymap;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {

	public static void main(String[] args) {

		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("Sunny", 101);
		hashMap.put(new String("Sunny"), 102);

		System.out.println("Hash Map value : " + hashMap);

		Map<String, Integer> identityHashMap = new IdentityHashMap<>();
		identityHashMap.put("Sunny", 101);
		identityHashMap.put(new String("Sunny"), 102);

		System.out.println("Identity Hash Map value : " + identityHashMap);
	}

}
