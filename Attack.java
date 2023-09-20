
public class Attack  {
	//Members
	int pointsCost;
	String attackName;
	String attackType;
	int baseDamage;
	//Construtcor
		public Attack(String n, int bd, int p, String atype) {
			this.attackName = n;
			this.baseDamage = bd;
			this.pointsCost = p;
			this.attackType =atype;
		
		}
		public void setpoints(int c) {
			this.pointsCost=c;
		}
		public void setattack(String a) {
			this.attackName=a;
		}
		public void setattackType(String t) {
			this.attackType = t;
		}
		public void baseDamage(int b) {
			this.baseDamage = b;
		}
		
		//Accessor Methods
		public int getpoints() {
			return pointsCost;
		}
		public String getName() {
			return attackName;
		}
		public String getattackType() {
			return attackType;
		}
		public int getbase() {
			return baseDamage;
		}
		
	
		
	}


