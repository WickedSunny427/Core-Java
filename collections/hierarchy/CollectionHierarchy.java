package com.corejavaprojects.collections.hierarchy;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.WeakHashMap;
import java.util.concurrent.BlockingQueue;

public class CollectionHierarchy {
	enum CODES {
		SUNNY, RITESH, REGU;
	}

	public static void main(String[] args) {
		System.out.println("=========Hierarchy Collect Framework============");

		// List
		List<String> arrayList = new ArrayList<>();
		List<String> linkedList = new LinkedList<>();
		List<String> vector = new Vector<>();
		List<String> stack = new Stack<>();

		// Set
		Set<String> hashSet = new HashSet<>();
		Set<String> linkedSet = new LinkedHashSet<>();
		Set<String> treeSet = new TreeSet<>();
		EnumSet<CODES> myCodes = EnumSet.of(CODES.REGU);

		// Queue
		Queue<String> arrayDeque = new ArrayDeque<>();
		Queue<String> priorityDeque = new PriorityQueue<>();
		Queue<String> blockingQueue = new PriorityQueue<>();
		Deque<String> deque = new ArrayDeque<>();

		Map<String, String> hashMap = new HashMap<>();
		Map<String, String> linkedMap = new LinkedHashMap<>();
		Map<String, String> treeMap = new TreeMap<>();
		Map<String, String> identityMap = new IdentityHashMap<>();
		Map<String, String> weakHashMap = new WeakHashMap<>();

	}

}
