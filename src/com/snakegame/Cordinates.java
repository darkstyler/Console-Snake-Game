package com.snakegame;

public class Cordinates {

	private int x;
	private int y;
	
	public int getX() {
		return this.x;
	}
	public void setX(int x) {
		this.x=x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setY(int y) {
		this.y =y;
	}
	
	public Cordinates(int y, int x) {
		this.x = x;
		this.y = y;
	}
	
}
