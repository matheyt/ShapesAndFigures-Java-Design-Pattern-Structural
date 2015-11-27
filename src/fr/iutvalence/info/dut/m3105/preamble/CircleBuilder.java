package fr.iutvalence.info.dut.m3105.preamble;

public class CircleBuilder {

	private Shapes current;
	
	public CircleBuilder(int radius){
		current =  new Circle(radius);
	}
	
	public CircleBuilder setColor(int red, int green, int blue){
		current = new FillColor(red, green, blue, current);
		
		return this;
	}
	
	public CircleBuilder setShadow(int intensity, int angle){
		current = new AddShadow(intensity, angle, current);
		
		return this;
	}
	
	public CircleBuilder setBorder(int thickness){
		current = new AddBorder(thickness, current);
		
		return this;
	}
	
	public Shapes getCircle() {
		return current;
	}
}
