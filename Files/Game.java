package me.dilan.videogame;

import java.awt.Canvas;

import me.dilan.videogame.window.Window;

public class Game extends Canvas implements Runnable{

	private static final long serialVersionUID = 1L;
	
	private Thread thread;
	public boolean running = false;
	
	
	public static final int WIDTH = 700;
	public static final int HEIGHT = 500;
	
	
	
	public Game() {
		
		new Window(this);
		
	}
	
	private void tick() {
		
	}
	
	private void render() {
		
	}
	
	
	public static void main(String[] args) {
		new Game();
	}
	
	public synchronized void start() {
		
		if (running) return;
		
		thread = new Thread(this);
		thread.start();
		running = true;
		
	}
	
	public void run() {
		
		long time = System.nanoTime();
		double nanoframes = 1e9 / 60.0;
		double difference = 0;
		
		while(running) {
			
			long now = System.nanoTime();
			difference += (now - time) / nanoframes;
			time = now;
			while (difference >= 1) {
				tick();
				difference--;
			}
			
			render();
			
		}
		
	}
	
}
