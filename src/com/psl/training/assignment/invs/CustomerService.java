package com.psl.training.assignment.invs;

import java.io.FileReader;
import java.util.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CustomerService {

	private List<Customer> customers = new ArrayList<Customer>();
	private String fileName = "src/com/psl/training/assignment/invs/customer-info.txt";

	public Customer createCustomer(String str[]) {
		return new Customer(Integer.parseInt(str[0].trim()), str[1].trim());
	}

	public CustomerService() {
		super();
		try {
			FileReader file = new FileReader(fileName);
			int ch;
			String fileContent = "";
			while ((ch = file.read()) != -1) {
				fileContent += (char) ch;
			}
			if (fileContent.isBlank() || fileContent.isEmpty()) {
				file.close();
				throw new InsufficientDataException("Data is insufficient: Customer");
			}
			String persons[] = fileContent.split("\n");
			for (String cust : persons) {
				String values[] = cust.split(",");
				Customer fetchedItem = createCustomer(values);
				this.customers.add(fetchedItem);
			}
			System.out.println("Data fetched succesfully: Customer");
			file.close();
		} catch (Exception e) {
			System.out.println("Data fetch failed: Customer");
			System.out.println(e.getMessage());
		}
	}

	/**
	 * @return the customers
	 */
	public List<Customer> getCustomers() {
		return customers;
	}

	/**
	 * @param customers the customers to set
	 */
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public PurchaseOrder[] findOrdersPlacedByCustomer(int customerId) {
		Customer customer = null;
		for (Customer cust : customers) {
			if (cust.getId() == customerId) {
				customer = cust;
				break;
			}
		}
		return customer.purchaseOrders;
	}

	public PurchaseOrder[] findOrdersToBeShippedOn(Date findDate) {
		List<PurchaseOrder> orders = new ArrayList<PurchaseOrder>();
		for (Customer cust : customers) {
			PurchaseOrder[] arrayOfOrders = cust.getPurchaseOrders();
			if (arrayOfOrders != null) {
				for (PurchaseOrder ord : arrayOfOrders) {
					if (ord.shipDate.compareTo(findDate) == 0) {
						orders.add(ord);
					}
				}
			}
		}
		PurchaseOrder[] fetchedOrders = new PurchaseOrder[orders.size()];
		int k = 0;
		for (PurchaseOrder prd : orders) {
			fetchedOrders[k] = prd;
			k++;
		}
		return fetchedOrders;
	}

	public LinkedHashMap<String, Integer> getCustomerIdByArea() {
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		for (Customer cust : customers) {
			map.put(cust.getState(), cust.getId());
		}
		return map;
	}

	public ArrayList<String> getItemsFromPurchaseOrder(PurchaseOrder[] arr) {
		ArrayList<String> listOfItems = new ArrayList<String>();
		if (arr == null) {
			return null;
		}
		for (int i = 0; i < arr.length; i++) {
			PurchaseOrder purchaseOrder = arr[i];
			OrderItem[] orderItems = purchaseOrder.orderItems;
			for (int j = 0; j < orderItems.length; j++) {
				OrderItem orderItem = orderItems[j];
				listOfItems.add(orderItem.stockItem.itemDescription);
			}
		}
		return listOfItems;
	}

	public LinkedHashMap<String, LinkedHashMap<Integer, ArrayList<String>>> segregateOrderAndCustomerByArea() {
		LinkedHashMap<String, LinkedHashMap<Integer, ArrayList<String>>> result = new LinkedHashMap<String, LinkedHashMap<Integer, ArrayList<String>>>();
		LinkedHashMap<String, Integer> areaAndIdMap = getCustomerIdByArea();
		for (Map.Entry<String, Integer> map : areaAndIdMap.entrySet()) {
			LinkedHashMap<Integer, ArrayList<String>> m2 = new LinkedHashMap<Integer, ArrayList<String>>();
			String area = map.getKey();
			Integer customerId = map.getValue();
			ArrayList<String> items = getItemsFromPurchaseOrder(findOrdersPlacedByCustomer(customerId));
			m2.put(customerId, items);
			result.put(area, m2);
		}
		return result;

	}

}
