package fr.iutvalence.info.dut.m3105.preamble;

public class Rectangle extends Shapes {
	
	private int height;
	private int width;
	
	public Rectangle(int height, int width){
		this.height = height;
		this.width = width;
	}
	
	public String toString(){
		return "(Width, height) : ("+this.width+", "+this.height+")";
	}
}
