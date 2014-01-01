package com.bits.handson.collections;

import java.util.ArrayList;
import java.util.List;

import com.bits.handson.collections.dtos.Item;
import com.bits.handson.collections.dtos.Order;

public class ListDemo {

	public static void main(String[] args) {
		Order order = buildOrder();
		displayOrder(order);

	}

	private static void displayOrder(Order order) {
		System.out.println("Order Id: " + order.getId());
		System.out.println();
		List<Item> items = order.getItems();
		for (Item item : items) {
			System.out.println("Item Id: " + item.getId());
			System.out.println("Item Name: " + item.getName());
			System.out.println();
		}

	}

	private static Order buildOrder() {
		Order order = new Order();
		order.setId("1");

		ArrayList<Item> items = new ArrayList<Item>();

		Item javaBook = new Item();
		javaBook.setId("book1");
		javaBook.setName("Java Book");
		items.add(javaBook);

		Item personalDevBook = new Item();
		personalDevBook.setId("book2");
		personalDevBook.setName("Personal Development Book");
		items.add(personalDevBook);

		items.add(personalDevBook);

		// Collections.reverse(items);

		order.setItems(items);
		return order;
	}

}
