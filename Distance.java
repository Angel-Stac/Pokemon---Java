public class Distance{
	private
	double distance;
	//Constructor to accept a read in for keyboard and set it to distance// 
public Distance(double d) {
	distance=d;
	}
//set the distance to whatever is passed
public void setmeters(double d) {
	distance=d;
	}
//return the meters when asked//
public double getMeters(double d) {
	return distance;
	}
//convert to inches//
public double getInches(double d) {
	return d*39.37;
}
//convert to inches first then find the equivalent in feet// 
public double getFeet(double d) {
return (getInches(d)/12);

}
}
