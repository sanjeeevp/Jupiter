package com.jupiter;

import java.util.List;

public class Product 
{
	private long id;
	private String name;
	private List<Item> items;
	 
	public Product(Builder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.items = builder.items;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public List<Item> getItems() {
		return items;
	}
	
	public class Builder
	{
		private long id;
		private String name;
		private List<Item> items;
		
		public Builder()
		   {
		   }

		Builder id(long id) {
			this.id = id;
			return this;
			
		}
		Builder name(String name) {
			this.name = name;
			return this;
		}
		Builder items(List<Item> items) {
			this.items = items;
			return this;
		}
		
		Product build() 
		{
			return new Product(this);
		}
	}
}
