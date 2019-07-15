package com.codingdojo.pokemon;

public interface PokemonInterface {

	
	// Pokemon createPokemon(String name, int health, String type): This method creates and returns Pokemon.
	Pokemon createPokemon(String name, String type, int health);
	

	// String pokemonInfo(Pokemon pokemon): This method returns a String with the name, health, and type of the pokemon.
	void pokemonInfo(Pokemon pokemon);
	
	
	// void listPokemon(): List all the pokemon names that you have in your pokedex.
	void listPokemon();
	
	
	// attack pokemon
	void attackPokemon(Pokemon pokemon);
	
	
}
