package fr.quique.secondorderpolynomial;

public class Main {
	//this is the main class of our project, in this class, we will put few lines of code 

	public static void main(String[] args) {
		SecondOrderPolynomial f = new SecondOrderPolynomial(-2, 4, 8, -40, 0.1); //testing the code 
		/*We should have : 
		 * f(x) = a*x^2 + b*x + c
		 * 		= 1* (-6)^2 - 6 * 1 + 1
		 * 		= 36 - 6 + 1
		 * 		= 31
		 * We will check : */
		Panel pan = new Panel(f, "#DBFF33"); //this should be yellow (the background)
		Window win = new Window(1080, 720, pan, "Second Order Polynomial Curve (-2x^2 + 4x + 8)");
		System.out.println("y = " + win.getHeight() + "x = " + win.getWidth());
	}

}
