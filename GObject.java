package me.dilan.videogame;

import java.awt.Graphics;

import me.dilan.videogame.utilities.ID;

public abstract class GObject {

	protected float x, y;
	protected int width, height;
	
	protected ID id;

	public abstract void tick();
	public abstract void render(Graphics g);
	
	
	public GObject(float x, float y, int width, int height, ID id) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.id = id;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public ID getId() {
		return id;
	}

	public void setId(ID id) {
		this.id = id;
	}
	
}
