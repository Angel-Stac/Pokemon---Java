
public class Complex {
		private
		double real1;
		double imag;
		/*Constructor to set the variables*/
		public Complex(double Real,double Imaginary) {
			real1=Real;
			imag=Imaginary;
		}
		//get the real number
		double getReal() {
			return real1;
		}
		//get the imaginary number//
		double getImag() {
			return imag;
		}
		//set the real number to whatever is passed
		void setReal(double r1) {
			real1=r1;
		}
		//set the imaginary number to whatever is passed
		void setImag(double i1) {
			imag=i1;
		}
		//add the real and imaginary number//
		 public void addComplex(Complex B){
			  real1=real1+B.real1;
		      imag=imag+B.imag;
}
		 //subtract the real and imaginary number
		public void SubtractComplex(Complex B){
		real1=real1-B.real1;
        imag=imag-B.imag;
}
			
		//multiply and subtract the real and imaginary number 
		void MultiplyComplex(Complex B) {
			double product1;
			double product2;
			double product3;
			double product4;
			double finalReal;
			double finalImag;
			/*Calculate using foil method*/
			product1=real1*B.real1;
			product2=real1*B.imag;
			product3=imag*B.real1;
			product4=(imag*B.imag)*-1;
			/*Store everything in two final variables*/
			finalReal=product1+product4;
			finalImag=product2+product3;
			System.out.print("The product is "+finalReal + " + " +finalImag+"i");
	}
}
		
		
		
		
	


