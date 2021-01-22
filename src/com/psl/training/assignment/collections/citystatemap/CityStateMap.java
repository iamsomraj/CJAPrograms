package com.psl.training.assignment.collections.citystatemap;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Date 21.1.21 Java Assignments Write a class CityStateMap by using child class
 * of java.util.Collection. This mapping class will allow the user to add new
 * city-state pair in to it. User can get the state of the city by calling get
 * method on this class. Duplicate city entries are not allowed, in such case
 * previous mapping should be replaced with new one. Assume that there is a text
 * file having city state values (in string). Read this file and store these
 * values using CityStateMap class. Let user do the following operations with
 * this class:
 * 
 * 1. Get all cities
 * 
 * 2. Get All states
 * 
 * 3. Get cities for a state
 * 
 * 4. Add new city state pair
 * 
 * 5. Delete all the cities for a given state
 * 
 * @author Somraj Mukherjee
 *
 */
public class CityStateMap {

	private String fileName = "src/com/psl/training/assignment/collections/citystatemap/data.txt";
	private TreeMap<String, String> cityStateMap = new TreeMap<String, String>();

	public CityStateMap() throws Exception {
		super();
		FileReader fileReader = null;
		String fileContent = "";
		try {
			fileReader = new FileReader(fileName);
			int ch;
			while ((ch = fileReader.read()) != -1) {
				fileContent += (char) ch;
			}
			String[] records = fileContent.split("\n");
			for (String rec : records) {
				String datas[] = rec.split(",");
				add(datas[0].trim(), datas[1].trim());
			}
			fileReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void add(String city, String name) {
		this.cityStateMap.put(city.toUpperCase(), name.toUpperCase());
		System.out
				.println("Value for city " + city.toUpperCase() + " is: " + this.cityStateMap.get(city.toUpperCase()));
		try {
			store();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void store() throws Exception {
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(fileName);
			String fileContent = "";
			for (Map.Entry<String, String> map : this.cityStateMap.entrySet()) {
				String key = map.getKey();
				String value = map.getValue();
				String line = key.trim().toUpperCase() + "," + value.trim().toUpperCase() + "\n";
				fileContent += line;
			}
			fileWriter.write(fileContent.substring(0, fileContent.length() - 1));
			fileWriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Set<String> getAllCity() {
		return this.cityStateMap.keySet();
	}

	public Set<String> getAllStates() {
		LinkedHashSet<String> allStateSet = new LinkedHashSet<String>(this.cityStateMap.values());
		return allStateSet;
	}

	public Set<String> getAllCitiesForState(String state) {
		LinkedHashSet<String> allCitiesForStateSet = new LinkedHashSet<String>();
		for (Map.Entry<String, String> map : this.cityStateMap.entrySet()) {
			String key = map.getKey().toUpperCase();
			String value = map.getValue().toUpperCase();
			if (value.equals(state.toUpperCase())) {
				allCitiesForStateSet.add(key.toUpperCase());
			}
		}
		return allCitiesForStateSet;

	}

	public void deleteAllCitiesForState(String state) {
		Set<String> citiesToBeDeleted = getAllCitiesForState(state);
		for (String str : citiesToBeDeleted) {
			this.cityStateMap.remove(str);
		}
	}

	@Override
	public String toString() {
		return "CityStateMap [cityStateMap=" + cityStateMap + "]";
	}

}
