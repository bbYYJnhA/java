import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;



public class Platno extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int sirina;
	public int dolzina;
	public Graf graf;
	
	public Platno(int sirina, int dolzina) {
		this.sirina = sirina;
		this.dolzina = dolzina;
		this.graf = null;
	}
	

	public Dimension getPreferredSize(){
		return new Dimension(sirina, dolzina);
	}
	
	public void narisi(Graf g){
		graf = g;
	}
		
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		if (graf==null){
			return;
		}	    
		g.setColor(Color.blue);
		//
		for (Tocka i : graf.tocke.values()){			
            int x = (int) (i.x - (i.x/10));
            int y = (int) (i.y - (i.y/10));
            //Ellipse2D.Double shape = new Ellipse2D.Double(x, y, 11, 11);
            //Elipse2D.double
            g.fillOval(x, y, 11, 11);
		}
		
		//g.drawLine(x1, y1, x2, y2);
		//g.fillOval(x, y, width, height);
	}
	

	
}
