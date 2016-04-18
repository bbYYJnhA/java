package geometrija;

public class Krog extends Lik {
	protected double polmer;

	public Krog(double x, double y, double polmer) {
		super(x, y);
		this.polmer = polmer;
	}
	
	public double ploscina(){
		return Math.PI*((this.polmer)*(this.polmer));
	}

}
