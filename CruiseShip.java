
public class CruiseShip extends Ship {//Cruise ship is the subclass
public CruiseShip(String n, int y,int m) {//Inherits the superclass constructor and adds one more member//
		super(n, y);
		maxPassengers=m;
}
private int maxPassengers;
public void setMax(int maxPassengers) {//set the max passengers
	this.maxPassengers=maxPassengers;
}
public int getMax() {//get the max amount of passengers
	return maxPassengers;
}
public String toString() {//to string method to print the info about the ship
	String p=" ";
	p+="Ship Name: "+getName()+", Maximum amount of Passengers: "+getMax();
	return p;
}






}
