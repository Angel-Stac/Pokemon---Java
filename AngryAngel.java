 




public class AngryAngel extends Pokemon {
	int hitPoints=0;
	int powerP=0;
	String name = "AngryAngel";
	String type= "Fire";
	

	 
	
	
	public AngryAngel(String n,int powerP,int hitPoints,String t){
		super(n,powerP,hitPoints,t);
		attacks.add(new Attack("Stylebender", 35, 20, "Fire")); //Adding attack into arrayList
		attacks.add(new Attack("DragonAttack", 15, 10, "Poison")); //Adding attack into arrayList
		attacks.add(new Attack("Poseidon", 25, 10, "Water"));
}

	
	public void attack(Pokemon other, int attackIndex) {
		//do calculations and calculate hit points 
		//Attack is effective
	      attacks.get(attackIndex).getbase();
	      System.out.println(this.getname()+" is attacking "+other.getname()+"!");
	     other.sethitPoints(other.gethitPoints()-attacks.get(attackIndex).getbase());
	      System.out.println(other.getname()+"'s hitpoints "+ other.gethitPoints());
	      
	}
		
		
	


	
	public void speak() {
		System.out.println("You cant kill me,No Luck!");
		
	}


	@Override
	public void use() {
		// TODO Auto-generated method stub
		
	}

}

