
public class ComputerPlayer extends Player { 
	String name;
	
	public ComputerPlayer(Pokemon p, ComputersLifeSaver t) {
		//Inheriting the super class constructor
		super(p, t);
		name = "Computer";
	}
	//Overriding the abstract methods
	public String getName() {
		return name;
	}
	 
	//Overriding the abstract methods
	public Pokemon getPokemon() {
		// TODO Auto-generated method stub
		return pokemon;
	}

	//Overriding the abstract methods
	public ComputersLifeSaver getItem() {
		// TODO Auto-generated method stub
		
		return item;
	}

	
	//Overriding the abstract methods
	public void run() {
		System.out.println("I quit!");
		//randomly call system.exit
		
		System.exit(1);
	}
	@Override
	public void attack(Pokemon other, int attackIndex) {
		// TODO Auto-generated method stub
		
	}
	

}
