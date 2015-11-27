package fr.iutvalence.info.dut.m3105.preamble;

public class Position {
	
	private int x;
	
	private int y;

	public Position(int posX, int posY){
		this.x = posX;
		this.y = posY;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public String toString(){
		return ""+this.x+", "+this.y;
	}
}
