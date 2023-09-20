import java.util.Scanner;

class DistanceRunner{

	public static void main(String args[]) {
		//variable to read in data from keyboard to be stored into//
		double d;
		//reading in data from the keyboard//
		Scanner input =new Scanner(System.in);
		//Tell the user to type in a distance
		System.out.print("Type in a distance"+"\n");
		//d is going to equal whatever is entered
		d=input.nextDouble();
		//take whatever what was entered from the keyboard and store in the new object
		Distance Avenue = new Distance (d);
		//call all the functions to convert
		System.out.print("The distance is "+Avenue.getMeters(d)+" meters."+"\n");
		System.out.print("Inches conversion is "+Avenue.getInches(d)+" inches"+"\n");
		System.out.print("It is "+Avenue.getFeet(d)+" feet"+"\n");
		
		
	}
}
		
		
		

