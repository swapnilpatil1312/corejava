package com.app.fruits;

abstract class Fruit {
	String color;
	double weight;
	String name;
	boolean isfresh=true;
	String flewar;
	int fruits;
	

	public Fruit(String color, double weight, String name) {
		super();
		this.color = color;
		this.weight = weight;
		this.name = name;
		

	}

	 public String getName() {
		return name;
	}

	public boolean isFresh() {
		return isfresh;
	}

	public void setFresh(boolean fresh) {
		isfresh = fresh;
	}

	public abstract String taste();

	@Override
	public String toString() {
		return "name:" + name + " color:" + color + " weight:" + weight + " isfresh:" + isfresh;
	}
		
	}


