package fr.quique.secondorderpolynomial;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class Panel extends JPanel{
	
	private static final long serialVersionUID = 1L;
	//this class will extend the Swing JPanel class, we will add this component in our window and draw our function on it
	private SecondOrderPolynomial f; //the function associated to the panel
	private Color bgColor; //the background color of the panel
	
	public Panel(SecondOrderPolynomial f, String bgColor) { //the background color is a string representing an hexadecimal color
		
		this.f = f;
		this.bgColor = Color.decode(bgColor); //deconding the hexadecimal color code and setting the color
		this.setBackground(this.bgColor); //set the background so we can see the function
	}
	
	/*Now, we will draw the curve of our function on the JPanel using the PaintComponent method
	 * ->First, we will have to calculate 1080 points (because our Window will be 1080 * 720px)
	 * We will start by calculating f(startNumber) and then f(startNumber + increment) !
	 * ->Each point will be represented by a pixel, let's do the code.
	 */
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Random r = new Random();
		int d;
		for(int i = 0; i <= 1080; i++) { //loop for the sop
			d = (int) (f.calculate(f.getStartNumber() + (f.getIncrement() * i))); //f(x) = a*(x+increment)^2 + b*(x+increment) + c
			if(i%30 == 0) {g.setColor(new Color(r.nextInt(256), r.nextInt(256) , r.nextInt(256)));}
			g.drawRect(i, - d + 10, 1, 1); //1 * 1 because it's a pixel
			/*This should be good, but we will modify it later to add r*/
		}
	}
	
	public SecondOrderPolynomial getSecondOrderPolynomial() {
		return f;
	}
}	
