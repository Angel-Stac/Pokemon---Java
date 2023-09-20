
public class LifeSaver implements Item {

	@Override
	public void use(Pokemon p) {
		//member variables
	int chances = 0;
	int moreLife = 0;
	if(chances==0) {
        	 
			
			p.sethitPoints(p.gethitPoints()+moreLife);
			//extra hit points should only be used once
        	 chances++;
		} 

	else {
		System.out.print("No More Second Chances, its called a second chance for a reason!!!!!!!");
		
	}
		
	}

}
