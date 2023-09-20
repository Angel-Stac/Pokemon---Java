import java.util.ArrayList;
import java.util.List;

abstract class Pokemon {
	//Member variables
	int hitPoints;//How much a Pokemon can take before it faints. Meaning its overall health
	int powerP;
	String name;
	String type;
	public abstract void attack(Pokemon other, int attackIndex);
	public abstract void speak();
	public abstract void use();
	
	protected ArrayList<Attack> attacks=new ArrayList<Attack>();
	//Constructor
	public Pokemon(String n,int powerP,int p,String t) {
	this.hitPoints=p;
	this.powerP=powerP;
	this.name=n;
	this.type=t;
	}
	//Accessor methods
	public void sethitPoints(int h) {
		hitPoints=h;
	}
	public int  gethitPoints() {
		return hitPoints;
	}
	public void setPowerPoints(int p) {
		powerP=p;
	}
	public int getPowerPoints() {
		return powerP;
	}
	public void setname(String s) {
		name=s;
	}
	public String getname() {
    	return name;
    }
	public void settype(String t) {
		type=t;
	}
	public String getType() {
		return type;
	}
	
}


