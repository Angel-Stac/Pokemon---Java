
public class CargoShip extends Ship {
private int capacity;
	public CargoShip(String n, int y,int c) {
		super(n, y);
		capacity=y;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String toString() {
		String s=" ";
		s+="Ship Name: "+getName()+", "+"Capacity: "+getCapacity();
		return s;
	}

}
