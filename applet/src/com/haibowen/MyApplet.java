package com.haibowen;

import java.awt.Graphics;

import javax.swing.JApplet;

public class MyApplet extends JApplet{
	public void  paint (Graphics g) {
		super.paint(g);
		g.drawString("This is a java applet ",25,25);
	}
}