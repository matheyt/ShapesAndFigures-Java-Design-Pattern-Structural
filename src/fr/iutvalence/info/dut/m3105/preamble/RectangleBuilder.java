package fr.iutvalence.info.dut.m3105.preamble;

public class RectangleBuilder extends Shapes {

	private Shapes current;
	
	public RectangleBuilder(int height, int width){
		current =  new Rectangle(height, width);
	}
	
	public RectangleBuilder setColor(Color color){
		current = new FillColor(color, current);
		return this;
	}
	
	public RectangleBuilder setShadow(int intensity, int angle){
		current = new AddShadow(intensity, angle, current);
		return this;
	}
	
	public RectangleBuilder setBorder(int thickness){
		current = new AddBorder(thickness, current);
		return this;
	}
	
	public Shapes getRectangle() {
		return current;
	}
}
