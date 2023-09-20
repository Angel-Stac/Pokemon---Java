
 

public class Angel extends Pokemon {
	//Members
	int hitPoints=0;
	int powerP=0;
	String name = "Angel";
	String type= "Ice";
	
     //inheriting the superclass constructor
    public Angel(String n,int powerP,int hitPoints,String t){
			super(n,powerP,hitPoints,t);
			//Adding its attacks to its own attack list
			attacks.add(new Attack("Freeze", 25, 0, "Ice")); //Adding attack into arrayList
			attacks.add(new Attack("Medusa", 20, 0, "Psychic")); //Adding attack into arrayList
			attacks.add(new Attack("Fire", 10, 0, "Dragon")); //Adding attack into arrayList
			attacks.add(new Attack("Electricute", 35, 0, "Poison")); //Adding attack into arrayList
	}
    public void attack(Pokemon other, int attackIndex) {
		//Ice is super effective against Fire
    	
    	System.out.println(this.getname()+" is attacking "+other.getname()+"!");
    	other.sethitPoints(other.gethitPoints()-attacks.get(attackIndex).getbase());
    	System.out.println(other.getname()+"'s hitpoints "+ other.gethitPoints()); 
	};
	
		
		
		
	

	
		//Overriding the abstract methods
		public void speak() {
			System.out.println("ummmmmmmm");
			
		}
		@Override
		public void use() {
			// TODO Auto-generated method stub
			
		}
	}

	
	

