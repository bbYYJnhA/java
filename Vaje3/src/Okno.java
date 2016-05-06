import javax.swing.JFrame;


public class Okno extends JFrame {

	private static final long serialVersionUID = 6008121060903494831L;
	protected Platno platno;
	public Okno(){
		super();
		setTitle("Graf");
		platno = new Platno(600, 600);
		add(platno);
		
	}

}
