import java.util.HashMap;
import java.util.Map;
import java.util.Vector;


public class Graf {

	public Map<Object, Tocka> tocke;

	public Graf() {
		this.tocke = new HashMap<Object, Tocka>();
	}
	
	public Boolean povezava(Tocka x, Tocka y){
		if(x.sosedi.contains(y)){
			return true;
		}
		else{
			return false;
		}
	}
	
	public Tocka tocka(Object ime){
		return tocke.get(ime);
	}
	
	public void dodajTocko(Tocka x){
		this.tocke.put(x.ime, x);
	}
	
	public void dodajPovezavo(Tocka x, Tocka y){
		x.sosedi.add(y);
		y.sosedi.add(x);
	}
	
	public void odstraniPovezavo(Tocka x, Tocka y){
		x.sosedi.remove(y);
		y.sosedi.remove(x);
	}
	
	public void odstraniTocko(Tocka x){
		// zanka po x.sosedi
		for (Tocka i: x.sosedi){
			odstraniPovezavo(x, i);
		}
		this.tocke.remove(x.ime);
	}
	
	public static Graf prazen(int n){
		Graf g = new Graf();
		for(int i=0; i<n; i++){
			g.dodajTocko(new Tocka(i));
		}
		return g;
		
	}
	
	public static Graf cikel(int n){
		Graf g = Graf.prazen(n);
		//prazen(n);
		for (int i=0; i<n; i++){
			g.dodajPovezavo(g.tocka(i), g.tocka((i+1)%n));
		}
		return g;
		
	}
	
	public static Graf poln(int n){
		Graf g = Graf.prazen(n);
		Map slovar = g.tocke;
		// TODO dokonèaj
		for(int i=0; i<n; i++){			
			g.dodajPovezavo(g.tocka(i), g.tocka(i+1));
		}
		return g;
		
	}
	
	
	// Ali je graf povezan?
	public Boolean povezan(){
		Vector<Tocka> obiskane = new Vector(0, tocke.size());
		Object prva = tocke.values().iterator().next();
		for(Tocka i: tocke.values()){
			obiskane.add(i);
		}
		return true;		
	}
		
}


