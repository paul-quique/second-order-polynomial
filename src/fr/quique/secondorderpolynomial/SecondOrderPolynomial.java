package fr.quique.secondorderpolynomial;

public class SecondOrderPolynomial {
	//this class will represent a second order polynomial (a*x^2 + b*x + c)
	private double a, b, c; //represents a , b , and c
	private int startNumber; //will contain the start number
	private double increment; //will contain the increment
	/*private double r; //i will explain this field later. */
	
	public SecondOrderPolynomial(double a, double b, double c, int startNumber, double increment) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.startNumber = startNumber;
		this.increment = increment; 
	}
	
	public int calculate(double x) {
		int result; //the result of x by the function
		result = (int) ((a*Math.pow(x, 2) + b*x + c)); //this will calculate the result of x by the function
		return result; //return the result
	}
	
	public double getStartNumber() {
		return startNumber; //return the start number
	}
	
	public double getIncrement() {
		return increment; //return the increment
	}
	
}
