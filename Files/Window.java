package me.dilan.videogame.window;

import java.awt.Dimension;

import javax.swing.JFrame;

import me.dilan.videogame.Game;

public class Window extends JFrame {

	private static final long serialVersionUID = 1L;

	public Window(Game g) {
		
		setTitle("My Lame Game");
		add(g);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(new Dimension(Game.WIDTH, Game.HEIGHT));
		setResizable(false);
		setVisible(true);
		
	}
	
	
}
