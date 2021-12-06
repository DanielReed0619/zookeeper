package com.dr.zookeeper;

public class Gorilla extends Mammal {
	
	
	public int throwSomething() {
		this.setEnergyLevel(-5);
		System.out.println("The gorilla has thrown something, duck!. The gorilla's energy has decreased by 5. New energy is:");
		System.out.println(this.getEnergy());
		return this.getEnergy();
	}
	
	
	public int eatBanannas() {
		this.setEnergyLevel(10);
		System.out.println("mmm yummy bananna. energy increased by 10. New energy is:");
		System.out.println(this.getEnergy());
		return this.getEnergy();
	}
	
	
	public int climb() {
		this.setEnergyLevel(-10);
		System.out.println("The gorilla has climbed a tree. energy decreased by 10. New energy is:");
		System.out.println(this.getEnergy());
		return this.getEnergy();
	}
	
}
