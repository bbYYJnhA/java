package geometrija;

public abstract class Lik {
	
	// referenèna toèka (atributi objekta)
	protected double x;
	protected double y;
	
	// konstruktor
	public Lik(double x, double y) {
		//super();
		// this je v pythonu self
		this.x = x;
		this.y = y;
	}

	
	// Še en konstruktor
	public Lik() {
		//	super();
		this(0.0, 0.0);
	}



	@Override
	public String toString() {
		return "Lik [x=" + x + ", y=" + y + "]";
	}
	

	public void premakni(double dx, double dy){
		this.x += dx;
		this.y += dy;
	}
	
	public abstract double ploscina();
}
