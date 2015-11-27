package fr.iutvalence.info.dut.m3105.preamble;

public class AddShadow extends Shapes{
	
	private int intensity;
	private int angle;
	private Shapes shape;
	
	
	public AddShadow(int intensity, int angle, Shapes shape) {
		this.intensity = intensity;
		this.angle = angle;
		this.shape = shape;
	}
	public String toString(){
		return this.shape.toString()+", Shadow(intensity, angle): "+this.intensity+", "+this.angle;
	}
}
