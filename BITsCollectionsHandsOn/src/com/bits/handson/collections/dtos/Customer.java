package com.bits.handson.collections.dtos;

public class Customer {

	private String name;
	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Customer) {
			Customer customer = (Customer) obj;
			if (customer.getId() == this.getId()) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return id*9;
	}
}
