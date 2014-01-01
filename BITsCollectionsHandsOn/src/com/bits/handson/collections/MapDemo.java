package com.bits.handson.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bits.handson.collections.dtos.Item;
import com.bits.handson.collections.dtos.Order;

public class MapDemo {
	public static void main(String[] args) {
		Map<String, List<Order>> customerOrders = buildMap();

		displayCustomerOrders(customerOrders);
	}

	private static void displayCustomerOrders(
			Map<String, List<Order>> customerOrders) {     // Map works on the basis of Key Value pairs. Hence the Key is the customer name or id and the Value is the "List data type of orders" to maintain the list of customer orders.
		List<Order> bharathsOrders = customerOrders.get("Bharath");
		for (Order order : bharathsOrders) {
			System.out.println("Order Id: " + order.getId());
			List<Item> items = order.getItems();
			for (Item item : items) {
				System.out.println("Item Name: " + item.getName());
				System.out.println("Item Price: " + item.getPrice());
			}
		}
	}

	private static Map<String, List<Order>> buildMap() {
		Map<String, List<Order>> customerOrders = new HashMap<String, List<Order>>();

		List<Order> bharathsOrders = new ArrayList<Order>();

		Order order = new Order();
		order.setId("order1");

		List<Item> items = new ArrayList<Item>();

		Item item = new Item();
		item.setId("item1");
		item.setName("javaBook");
		item.setPrice(20);

		items.add(item);

		order.setItems(items);

		bharathsOrders.add(order);

		customerOrders.put("Bharath", bharathsOrders);

		return customerOrders;
	}
}
