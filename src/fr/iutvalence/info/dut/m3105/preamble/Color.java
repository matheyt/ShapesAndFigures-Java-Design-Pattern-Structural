package fr.iutvalence.info.dut.m3105.preamble;

public class Color {
	private int red;
	private int green;
	private int blue;
	
	public Color(int red, int green, int blue) {
		this.red = red;
		this.green = green;
		this.blue = blue;
	}
	
	public String toString(){
		return "Color(R,G,B) : ("+this.red+", "+this.green+", "+this.blue+")";
	}
}
