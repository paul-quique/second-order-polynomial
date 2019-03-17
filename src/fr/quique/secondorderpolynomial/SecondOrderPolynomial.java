package fr.quique.secondorderpolynomial;

public class SecondOrderPolynomial {
	//this class will represent a second order polynomial (a*x^2 + b*x + c)
	private double a, b, c; //represents a , b , and c
	private int startNumber; //will contain the start number
	private double increment; //will contain the increment
	private int x = 0, y = 0; //we will use these fields to move our function
	
	public SecondOrderPolynomial(double a, double b, double c, int startNumber, double increment) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.startNumber = startNumber;
		this.increment = increment; 
	}
	
	public int calculate(double x) {
		int result; //the result of x by the function
		result = (int) ((a*Math.pow(x - this.x, 2) + b*(x - this.x) + c)); //this will calculate the result of x by the function
		return (result - this.y); //return the result and reduce it of y
	}
	
	public double getStartNumber() {
		return startNumber; //return the start number
	}
	
	public double getIncrement() {
		return increment; //return the increment
	}
	
	public void setIncrement(double increment) {
		this.increment = increment;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	
}
