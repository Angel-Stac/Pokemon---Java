
public class Ship {

private String name;
private int year;
public
//set the name
void setName(String name) {
	this.name=name;
} 
//get the name
String getName() {
	return name;
}
//set the year
void setYear(int year) {
	this.year=year;
}
//get the year
public int getYear() {
	return year;
 }
//constructor for the ship
  public Ship(String n,int y) {
	  name=n;
	  year=y;
  }
  //to string method to print info about the ship
  public String toString() {
	  String s =" ";
	  s+="Ship: "+getName()+", Year: "+getYear();
	  return s;
  }


 
}

