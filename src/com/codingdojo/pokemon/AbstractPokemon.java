package com.codingdojo.pokemon;

public abstract class AbstractPokemon implements PokemonInterface {
	
	
	// Create an abstract class that only implements createPokemon and pokemonInfo(Pokemon pokemon) from the PokemonInterface.
	
	// Create Pokemon 
	public Pokemon createPokemon(String name, String type, int health) {
		return new Pokemon(name, type, health);
	}

		
	// Get Pokemon info
	public void pokemonInfo(Pokemon pokemon) {
		System.out.println("Name: " + pokemon.getName() + "/ Health: " + pokemon.getHealth() + "/ Type: " + pokemon.getType());
	}

	
	// --------------------------------------Attack Method----------------------------------------------->>
	
	// void attackPokemon(Pokemon pokemon): This method lowers the attacked Pokemon's health by 10
	public void attackPokemon(Pokemon pokemon) {
		pokemon.setHealth(pokemon.getHealth() - 10);
		System.out.println(pokemon.getName() + " has been attacked, health remaining is: " + pokemon.getHealth());
	}
		
}
