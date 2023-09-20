
public class HumanPlayer extends Player {
	String name;
	//Superclass Constructor
	public HumanPlayer( Pokemon pokemon, ComputersLifeSaver i) {
		super(pokemon, i);

	}
	@Override
	//Defining functions
	public Pokemon getPokemon() {
		// TODO Auto-generated method stub
		return pokemon;
	}
	@Override
	public ComputersLifeSaver getItem() {
		// TODO Auto-generated method stub
		return item;
	}
	@Override
	public void run() {
		System.out.print(this.name+" is running away!");
		
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	@Override
	public void attack(Pokemon other, int attackIndex) {
		// TODO Auto-generated method stub
		
	}
	
	

}

