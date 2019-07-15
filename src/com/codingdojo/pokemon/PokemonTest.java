package com.codingdojo.pokemon;

public class PokemonTest {

	public static void main(String[] args) {
		
		
		Pokedex p1 = new Pokedex();
		Pokedex p2 = new Pokedex();
		
		Pokemon eevee = p1.createPokemon("Eevee","Flying", 50);
		Pokemon charizard = p1.createPokemon("Charizard", "Flying", 100);
		
		Pokemon picachu = p2.createPokemon("Pickachu", "Electric", 80);
		Pokemon charmander = p2.createPokemon("Charmander", "Fire", 60);
		
		
		
		System.out.println("----------------Pokedek 1 Info---------------------");
		p1.pokemonInfo(eevee);
		p1.pokemonInfo(charizard);

		
		System.out.println("----------------Pokedek 2 Info---------------------");
		p2.pokemonInfo(picachu);
		p2.pokemonInfo(charmander);
		
		
		System.out.println("----------------Attack Info---------------------");
		p1.attackPokemon(picachu);
		p1.attackPokemon(charmander);
		
		p2.attackPokemon(eevee);
		
		
		
		System.out.println(Pokemon.getPokemonCount());
		
		
		//System.out.println(p1.listPokemon());
	
	
		
	
		
		// Create a test file where you instantiate pokemon, attack pokemon, 
		//and list pokemon from a pokedex.
		
		
	}

}
