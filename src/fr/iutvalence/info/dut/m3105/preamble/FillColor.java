package fr.iutvalence.info.dut.m3105.preamble;

public class FillColor extends Shapes {
	
	private Color color;
	private Shapes shape;
	
	public FillColor(Color color, Shapes shape) {
		this.color=color;
		this.shape = shape;
	}
	public String toString(){
		return this.shape.toString()+", "+this.color.toString();
	}
	
}
