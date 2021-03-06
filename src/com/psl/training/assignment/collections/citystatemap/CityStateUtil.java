package com.psl.training.assignment.collections.citystatemap;

public class CityStateUtil {

	public static void main(String[] args) {
		CityStateMap cityStateMap = null;
		try {
			cityStateMap = new CityStateMap();
			System.out.println("All cities: ");
			System.out.println(cityStateMap.getAllCity());
			System.out.println("All states: ");
			System.out.println(cityStateMap.getAllStates());
			cityStateMap.add("Patna", "Bihar");
			cityStateMap.add("Asansol", "West Bengal");
			cityStateMap.add("Gangtok", "Sikkim");
			System.out.println("All cities: ");
			System.out.println(cityStateMap.getAllCity());
			System.out.println("All states: ");
			System.out.println(cityStateMap.getAllStates());
			System.out.println("Get all cities for a state: MAHARASHTRA");
			System.out.println(cityStateMap.getAllCitiesForState("MAHARASHTRA"));
			cityStateMap.add("Tatanagar", "Jharkhand");
			System.out.println("Delete all cities for a state: MAHARASHTRA");
			cityStateMap.deleteAllCitiesForState("MAHARASHTRA");
			System.out.println("Get all cities for a state: MAHARASHTRA");
			System.out.println(cityStateMap.getAllCitiesForState("MAHARASHTRA"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
