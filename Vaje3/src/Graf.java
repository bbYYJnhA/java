import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
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
		// TODO preveri če dela prav !!!
		for(int i=0; i<n; i++){
			for (Map.Entry<Object, Tocka> x : g.tocke.entrySet()){
				//Object prva = tocke.values().iterator().next();
				for (Map.Entry<Object, Tocka> y : g.tocke.entrySet()){
					g.dodajPovezavo(x.getValue(), y.getValue());
				}
				//System.out.println(entry.getKey() + "/" + entry.getValue());
			}
			//g.dodajPovezavo(g.tocka(i), g.tocka(i+1));
		}
		return g;
		
	}
	
	public static Graf polnDvodelen(int n, int m){
		Graf g = Graf.poln(n);
		Graf h = Graf.poln(m);
		//for(Tocka i : tocke.values()){
		//	
		//}
		return h;
		
	}



	@Override
	public String toString() {
		return "Graf [tocke=" + tocke + "]";
	}

	// Ali je graf povezan?
	public Boolean povezan(){
		//Vector<Tocka> obiskane = new Vector<Tocka>(0, tocke.size());
		Set<Tocka> mnozica = new HashSet<Tocka>();
		//Object prva = tocke.values().iterator().next();
		//Kopija grafa ...
		//Odsranitev elementa z grafa ...
		//Preveri delovanje !!!
		if(tocke.size() == 0){
			return true;
		}
		Tocka prva = tocke.values().iterator().next();
		for(Tocka i: tocke.values()){
			mnozica.add(prva);
			mnozica.addAll(prva.sosedi);
			//while (prva.contains)
			for (Tocka j : prva.sosedi){
				if(povezava(i, j)){
					mnozica.add(j);
					mnozica.addAll(j.sosedi);
					prva = j;
					//prva = i;
				}

			}
			//obiskane.add(prva);
			//obiskane.addAll(i.sosedi);
			//obiskane.addAll(prva.sosedi);
		
		}
		if (mnozica.size()==tocke.size()){
			//System.out.println(mnozica);
			return true;
		}
		else{
			//System.out.println(mnozica);
			return false;			
		}		
	}
		
}


