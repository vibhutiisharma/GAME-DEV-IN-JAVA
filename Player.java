package com.vibhuti.gaming.sprites;

import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Player extends Sprite {

	public Player() {
		w = 400;
		h = 400;
		x = 50;
		y = 400;
		image = new ImageIcon(Player.class.getResource("player.gif"));
	}
	public void move() {
		x= x+speed;
	}
	public boolean outOfScreen() {
		return x>1500;
	}
}
