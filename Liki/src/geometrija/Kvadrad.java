package geometrija;

public class Kvadrad extends Lik {
	private double stranica;

	public Kvadrad(double x, double y, double stranica) {
		super(x, y);
		this.stranica = stranica;
	}

	@Override
	public String toString() {
		return "Kvadrad [stranica=" + stranica + ", x=" + x + ", y=" + y + "]";
	}
	
	public double ploscina(){
		return (this.stranica)*(this.stranica);
	}


	
}
