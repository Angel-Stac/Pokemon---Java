
public class ComputersLifeSaver implements Item {
	int chances=0;
	int moreLife=50;
	
	public void use(Pokemon p) {
		if(chances==0) { 
	        	 p.sethitPoints(p.gethitPoints()+moreLife);
	        	 chances++;
	        	 //can only be used once
	        	 System.out.println("item used");
			} 

		else {
			System.out.println("No More Second Chances, its called a second chance for a reason!!!!!!!");
			
		}
			
		}

	}
