package fr.iutvalence.info.dut.m3105.preamble;

public abstract class Shapes {
	
	public void draw(Position p){
		System.out.println(toString()+", Position : ("+p.toString()+")");
	}
}
