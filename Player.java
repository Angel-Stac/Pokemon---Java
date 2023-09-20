import java.util.Scanner;

public abstract class Player {
	//Items and Pokemon//
	 Pokemon pokemon;
	 ComputersLifeSaver item;
	
	//Abstract functions to be defined
	 public abstract void attack(Pokemon other, int attackIndex);
	public abstract Pokemon getPokemon();
	public abstract ComputersLifeSaver getItem();
	public abstract void run();
	public abstract String getName(); //Get name of player - Specifies if Human or Computer

//Constructor
public Player(Pokemon p, ComputersLifeSaver t) {
	pokemon = p;
	item =t;
}
}
