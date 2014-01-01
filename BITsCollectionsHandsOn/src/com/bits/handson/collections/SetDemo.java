package com.bits.handson.collections;

import java.util.HashSet;
import java.util.Set;

import com.bits.handson.collections.dtos.Customer;

public class SetDemo {
	public static void main(String[] args) {
		Set<Customer> buildCustomerSet = buildCustomerSet();
		displayCutomerSet(buildCustomerSet);
	}

	private static void displayCutomerSet(Set<Customer> buildCustomerSet) {
		for (Customer customer : buildCustomerSet) {
			System.out.println("Customer Id: " + customer.getId());
			System.out.println("Customer name: " + customer.getName());

			System.out.println();
		}
	}

	private static Set<Customer> buildCustomerSet() {
		Set<Customer> customers = new HashSet<Customer>();
		Customer customer1 = new Customer();
		customer1.setId(1);
		customer1.setName("Amar");
		customers.add(customer1);

		Customer customer2 = new Customer();
		customer2.setId(2);
		customer2.setName("Akbar");
		customers.add(customer2);

		Customer customer3 = new Customer();
		customer3.setId(2);
		customer3.setName("Anthony");
		customers.add(customer3);
		return customers;
	}
}
