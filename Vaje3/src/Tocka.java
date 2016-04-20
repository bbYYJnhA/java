import java.util.HashSet;
import java.util.Set;


public class Tocka {
	public Object ime;
	public Set<Tocka> sosedi;
	public Tocka(Object ime) {
		this.ime = ime;
		this.sosedi = new HashSet<Tocka>();
	}
	// stopnja
	public int stopnja(){
		return this.sosedi.size();
		
		
	}
	
}
