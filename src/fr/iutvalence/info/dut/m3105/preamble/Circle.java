package fr.iutvalence.info.dut.m3105.preamble;

public class Circle extends Shapes {
	
	private int radius;
	
	public Circle(int rad){
		this.radius = rad;
	}
	
	public String toString(){
		return "Rayon : "+this.radius;
	}
}
