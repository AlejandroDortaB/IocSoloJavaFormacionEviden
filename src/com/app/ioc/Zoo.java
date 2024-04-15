package com.app.ioc;

public class Zoo {

	private iAnimal animal;
	
	Zoo(iAnimal animal){
		this.animal = animal;
	}
	
	public void getAnimalFood(){
		this.animal.Food();
	}
	
	public void getAnimalReproduction(){
		this.animal.Reproduction();
	}
}
