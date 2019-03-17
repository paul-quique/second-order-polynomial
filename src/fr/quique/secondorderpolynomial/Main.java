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
		Panel pan = new Panel(f, "#ffffff"); //this should be yellow (the background)
		KeyManager keyManager = new KeyManager(f, pan);
		Window win = new Window(1080, 720, pan, "Second Order Polynomial Curve (-2x^2 + 4x + 8)", keyManager);
		System.out.println("y = " + win.getHeight() + "x = " + win.getWidth());
	}

}
