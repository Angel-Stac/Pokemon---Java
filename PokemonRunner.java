
public class PokemonRunner {
	public static void main(String[] args) {
		//create items
		ComputersLifeSaver first= new ComputersLifeSaver();
		ComputersLifeSaver second=new ComputersLifeSaver();
		//Create Pokemon
		Angel angel=new Angel("angel",30,1,"Water");
		AngryAngel character= new AngryAngel("character",50,1,"Ice");
		//Created PLayers
		ComputerPlayer Player1=new ComputerPlayer(character,first);
		HumanPlayer player2= new HumanPlayer(angel,second);
		//Attacks
		player2.getPokemon().attack(Player1.getPokemon(),3);
		Player1.getPokemon().speak();//Angry Angel speaks
		Player1.getItem().use(character);//Character redeems itself
		Player1.getPokemon().attack(player2.getPokemon(),2);
		player2.getItem().use(character);//Angel redeems itself
		player2.getPokemon().attack(Player1.getPokemon(),1);
		Player1.getItem().use(character);//Character tries to redeem itself again
		Player1.run();//Computer Players run away

	//create computer object 
//use object to call attack function and pass the human player as other and generate random number to pass as attackIndex


		

		
		
		
		
	}
}
