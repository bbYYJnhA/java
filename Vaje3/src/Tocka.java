import java.util.HashSet;
import java.util.Set;


public class Tocka {
	public Object ime;
	public Set<Tocka> sosedi;
	public double x;
	public double y;
	public Tocka(Object ime) {
		this.ime = ime;
		this.sosedi = new HashSet<Tocka>();
		this.x = 0;
		this.y = 0;
	}
	
	// koordinate
	
	// stopnja
	public int stopnja(){
		return this.sosedi.size();
		
		
	}
	
}
