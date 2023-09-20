
public class ShipRunner {
	public static void main(String[] args) {
		
	Ship[] Ship=new Ship[3];
	Ship[0]=new Ship("Santa Maria",1865);
    Ship[1]=new CruiseShip("Royal Carribean",1996,2000);
    Ship[2]=new CargoShip("Santo Domingo",1936,500);
    for(int i=0;i<Ship.length;i++) {

    System.out.println(Ship[i].toString());	
  }
 }
}
