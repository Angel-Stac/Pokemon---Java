public class Meters {
	
	private
		double meters;

	//Constructor for meters//
	public Meters (double m) {
		m=meters;	
	}
	//set meters//
	public void setmeters(double m) {
	     meters=m;
		}
	//get the meters//
	public double getmeters(double m) {
		return meters;
	}
	//convert from meters to inches//
	public double getinches(double m) {
		double inches=m*39.37;
		return inches;
	}
	//convert to inches first in order to get conversion in feet// 
	public double getFeet(double m) {
		return (getinches(m)/12);
		
	}
}



