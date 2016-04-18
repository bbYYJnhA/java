package geometrija;

import java.util.ArrayList;

public class Skupek extends Lik {
	ArrayList<Lik> liki;

	public Skupek(double x, double y) {
		super(x, y);
		liki = new ArrayList<Lik>();
	}

	@Override
	public double ploscina() {
		double p = 0.0;
		for (Lik l : this.liki){
			p += l.ploscina();
		}
		return p;
	}
	
	
}
