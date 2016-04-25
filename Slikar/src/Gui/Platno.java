package Gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Platno extends JPanel implements MouseMotionListener{
	List<Krogec> krogci;
	
	public Platno(){
		super();
		this.setBackground(Color.red);
		this.addMouseMotionListener(this);
		this.krogci = new ArrayList<Krogec>();
	}
	
	
	
	public Dimension getPreferredSize(){
		return new Dimension(400, 300);
	}



	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		for (Krogec k : this.krogci){
			k.narisi(g);
		}
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		Graphics g = this.getGraphics();
		Krogec k = new Krogec(e.getX(), e.getY(), 2);
		g.fillOval(e.getX()-2, e.getY()-2, 5, 5);
		
	}



	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
