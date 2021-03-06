import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;

import javax.swing.JComponent;
import javax.swing.plaf.LayerUI;

class WallpaperLayerUI extends LayerUI<JComponent> {
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	  public void paint(Graphics g, JComponent c) {
	    super.paint(g, c);

	    Graphics2D g2 = (Graphics2D) g.create();

	    int w = c.getWidth();
	    int h = c.getHeight();
	    g2.setComposite(AlphaComposite.getInstance(
	            AlphaComposite.SRC_OVER, .5f));
	    g2.setPaint((Paint) new GradientPaint(0, 0, Color.yellow, 0, h, Color.red));
	    g2.fillRect(0, 0, w, h);

	    g2.dispose();
	  }
	}