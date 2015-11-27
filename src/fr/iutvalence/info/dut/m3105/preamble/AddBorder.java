package fr.iutvalence.info.dut.m3105.preamble;

public class AddBorder extends Shapes{
	
	private int thickness;
	private Shapes shape;
	
	public AddBorder(int thickness, Shapes shape) {
		this.thickness = thickness;
		this.shape = shape;
	}
	
	public String toString(){
		return this.shape.toString()+", Border(thickness): "+this.thickness;
	}
}
