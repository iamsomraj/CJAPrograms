package com.psl.training.assignment.collections.colmaputil;

import java.util.LinkedHashMap;
import java.util.Map;

public class ColMapUtil {

	public static LinkedHashMap<String, Integer> cachedResults = new LinkedHashMap<>();

	public static void storeResult(String str, int count) {
		cachedResults.put(str, count);
	}

	public static int getResult(String str) {
		return cachedResults.get(str);
	}

	public static int getUniqueCharNumbers(String str) {
		if (cachedResults.containsKey(str)) {
			return getResult(str);
		} else {
			LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
			int count = 0;
			String letters[] = str.split("");
			for (String letter : letters) {
				linkedHashMap.put(letter, linkedHashMap.containsKey(letter) ? linkedHashMap.get(letter) + 1 : 1);
			}
			for (Map.Entry<String, Integer> map : linkedHashMap.entrySet()) {
				if (map.getValue() == 1) {
					count++;
				}
			}
			storeResult(str, count);
			return count;
		}
	}

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println("Count of unique characters: "
				+ getUniqueCharNumbers("aaaaaabbbbbbbbfffffffffghhhhhhhhiiiiijjjjjllllllxhhhuiiiioeeeekrrrrrrrqsddd"));
		long end = System.currentTimeMillis();
		System.out.println("Time taken: " + (end - start) + " miliseconds");
		start = System.currentTimeMillis();
		System.out.println("Count of unique characters: "
				+ getUniqueCharNumbers("aaaaaabbbbbbbbfffffffffghhhhhhhhiiiiijjjjjllllllxhhhuiiiioeeeekrrrrrrrqsddd"));
		end = System.currentTimeMillis();
		System.out.println("Time taken: " + (end - start) + " miliseconds");
		start = System.currentTimeMillis();
		System.out.println("Count of unique characters: "
				+ getUniqueCharNumbers("aaaaaabbbbbbbbfffffffffghhhhhhhhiiiiijjjjjllllllxhhhuiiiioeeeekrrrrrrrqsddd"));
		end = System.currentTimeMillis();
		System.out.println("Time taken: " + (end - start) + " miliseconds");
		start = System.currentTimeMillis();
		System.out.println("Count of unique characters: "
				+ getUniqueCharNumbers("aaaaaabbbbbbbbfffffffffghhhhhhhhiiiiijjjjjllllllxhhhuiiiioeeeekrrrrrrrqsddd"));
		end = System.currentTimeMillis();
		System.out.println("Time taken: " + (end - start) + " miliseconds");
		

	}

}
