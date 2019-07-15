package com.codingdojo.pokemon;

// Concrete class
public class Pokemon {
	
	
	// name, health, and type member variables.
	private String name;
	private String type;
	private int health = 0;
	
	
	// --------------------------------------Count Tracking----------------------------------------------->>
	// a count static variable that keeps the number of Pokemon created in the program.
	private static int numberOfPokemons = 0;
	
	
	// --------------------------------------Default Constructor----------------------------------------------->>
	// a constructor class to set the instance's name, health, and type on creation
	public Pokemon(String name, String type, int health) {
		
		setName(name);
		setType(type);
		setHealth(health);
					
		// increment static count
		numberOfPokemons++;
		
	}
	
	
	// --------------------------------------Getters and Setters----------------------------------------------->>
	// getters and setters for each member variable.
		
	// getter for count of pokemons
	public static int getPokemonCount() {
		return numberOfPokemons;
	}
	
	// ------------Name Getters & Setters-------------->>
	// name getter
	public String getName() {
		return name;
	}
	
	// name setter
	public void setName(String name) {
		this.name = name;
	}
	
	// ------------Type Getters & Setters-------------->>
	// type getter
	public String getType() {
		return type;
	}
	
	// type setter
	public void setType(String type) {
		this.type = type;
	}
	
	// ------------Health Getters & Setters-------------->>
	// health getter
	public int getHealth() {
		return health;
	}
	
	// health setter
	public void setHealth(int health) {
		this.health = health;
	}
	
	

	
}
