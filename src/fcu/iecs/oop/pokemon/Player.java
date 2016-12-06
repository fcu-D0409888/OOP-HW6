package fcu.iecs.oop.pokemon;

public class Player {
	private String name;
	private Pokemon[] pokemons;
	//private Pokemon[] pokemons  = new Pokemon[100]
	private int level;
	public Player(String name, Pokemon[] pokemons, int level) {
		//super();		??
		this.name = name;
		this.pokemons = pokemons;
		this.level = level;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Pokemon[] getPokemons() {
		return pokemons;
	}
	public void setPokemons(Pokemon[] pokemons) {
		this.pokemons = pokemons;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
}
