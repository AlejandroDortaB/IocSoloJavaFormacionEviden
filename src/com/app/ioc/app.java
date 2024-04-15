package com.app.ioc;

public class app {
	public static void main(String[] args) {
		Zoo zoo= new Zoo(new Tiger());
		zoo.getAnimalFood();
		zoo.getAnimalReproduction();
	} 
}
