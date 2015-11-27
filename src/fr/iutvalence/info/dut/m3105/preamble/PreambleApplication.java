package fr.iutvalence.info.dut.m3105.preamble;

public class PreambleApplication
{
	public static void main(String[] args)
	{
		Shapes circ = new Circle(5);
		Shapes rect = new Rectangle(5,10);
		
		circ.draw(new Position(3,12));
		rect.draw(new Position(4,8));
	}

}
