package ColorSelect;

import java.awt.BorderLayout;

import java.awt.Color;

import java.awt.Graphics;

import java.awt.Point;

import java.awt.event.MouseEvent;

import java.awt.event.MouseMotionAdapter;

import java.awt.event.MouseMotionListener;

import javax.swing.*;

public class PaintPanel extends JPanel {

	private int pointCount = 0; 
	private int a = 4;
	private Point[] points = new Point[10000]; 
	private Color cor;

	public PaintPanel() { 
		
		
		addMouseMotionListener(

				new MouseMotionAdapter() { 

					public void mouseDragged(MouseEvent event) { 

						if (pointCount < points.length) {

							points[pointCount] = event.getPoint(); 

							pointCount++;  

							repaint(); 
						}
					}
				}
		);
	}
	public void changeAp() {
		this.a = this.a+4;
	
	}
	public void changeAm() {
		this.a = this.a-4;
	
	}
	public void clear() {
		this.pointCount = 0;
		
	}
	public void trocaCor(Color corzinha) {
		this.cor = corzinha;
	}
	public void paintComponent(Graphics g) {

		super.paintComponent(g); 

		for (int i = 0; i < pointCount; i++) {

			g.setColor(cor);

			g.fillOval(points[i].x, points[i].y, this.a, this.a);

		}

	}
}

