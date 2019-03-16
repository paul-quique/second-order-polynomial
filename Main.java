package fr.quique.secondorderpolynomial;

public class Main {
	//this is the main class of our project, in this class, we will put few lines of code 

	public static void main(String[] args) {
		SecondOrderPolynomial f = new SecondOrderPolynomial(1, 1, 1, 0, 0); //testing the code
		/*We should have : 
		 * f(x) = a*x^2 + b*x + c
		 * 		= 1* (-6)^2 - 6 * 1 + 1
		 * 		= 36 - 6 + 1
		 * 		= 31
		 * We will check : */
		System.out.println("Le résultat de -6 par f est : " + f.calculate(-6)); //works perfectly
	}

}
