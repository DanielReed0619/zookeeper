package com.dr.zookeeper;

public class Mammal {
	private int energyLevel = 100;
	
	public int displayEnergy() {
		System.out.println(this.energyLevel);
		return this.energyLevel;
	}
		
	public int getEnergy() {
		return this.energyLevel;
	
	}
	
	public void setEnergyLevel(int num) {
		energyLevel += num;
	}
}
