package com.vibhuti.gaming;

import javax.swing.JFrame;

public class GameFrame extends JFrame {
	public GameFrame() {
		Board board = new Board();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Game development in Java");
		setSize(1500,950);
		setResizable(false);
		setLocationRelativeTo(null);
		add(board);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GameFrame();
		
	}

}
