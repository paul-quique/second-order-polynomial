package fr.quique.secondorderpolynomial;

import javax.swing.JFrame; 

public class Window extends JFrame{
	
	private static final long serialVersionUID = 1L;
	//this class will extend the Swing JWindow class. We will use this class to generate the main window of our project
	private int width, height; //width and height of the window, here, we will use 1080 * 720
	private Panel pan; //the panel of our window
	private String title; //will contain the name of our window
	private KeyManager keyManager;
	
	public Window(int width, int height, Panel pan, String title, KeyManager keyManager ) {
		/*I prefer to stock the value in the fields, because i will probably have to change them later.*/
		this.keyManager = keyManager;
		this.height = height;
		this.width = width;
		this.pan = pan;
		this.title = title;
		this.setLocationRelativeTo(null); //the window will be centered
		this.setSize(this.width, this.height); //setting the size of the component
		this.setContentPane(this.pan); //we set the content paint (the component we will draw on)
		this.setTitle(this.title); //set the name of the window (i made an error, it's not setTitle)
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //will exit
		this.addKeyListener(this.keyManager); //add a key listener
		this.setResizable(false); //so the frame will not be resizable
		this.setVisible(true); //make this visible
	}
}
