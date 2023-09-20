public class ComplexRunner {
		public static void main(String args[]) {
			/*Creating the objects*/
Complex A=new Complex(7.0,23.0);	
Complex B=new Complex(6.0,17.0);
/* Calling the add complex function passes b so we can get the real number in b*/
A.addComplex(B);
if(A.imag<0) {
	System.out.print("The sum is:" + A.getReal() + " - " + A.getImag()*-1 + "i"+"\n");
}
else
System.out.print("The sum is:" + A.getReal() + " + " + A.getImag() + "i"+"\n");

A.SubtractComplex(B);
System.out.print("The difference is:" + A.getReal() + " - " + A.getImag() + "i"+"\n");
A.MultiplyComplex(B);



}
}


