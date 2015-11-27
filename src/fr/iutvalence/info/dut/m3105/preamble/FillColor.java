package fr.iutvalence.info.dut.m3105.preamble;

public class FillColor extends Shapes {
	
	private int red;
	private int green;
	private int blue;
	private Shapes shape;
	
	
	
	public FillColor(int red, int green, int blue, Shapes shape) {
		this.red = red;
		this.green = green;
		this.blue = blue;
		this.shape = shape;
	}
	public String toString(){
		return this.shape.toString()+", Color(R,G,B) :"+this.red+","+this.green+","+this.blue;
	}
	
}
