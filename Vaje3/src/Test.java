
public class Test {

	public static void main(String[] args) {
		Graf f = new Graf();
		// popravi napako
		//f.povezan();
		Tocka x = new Tocka(5);
		Tocka y = new Tocka(7);
		Tocka z = new Tocka(x);
		f.dodajTocko(x);
		f.dodajTocko(y);
		f.dodajPovezavo(x, y);
		f.dodajTocko(z);
		Graf g = Graf.cikel(10);
		Graf h = Graf.poln(42);		
		g.razporedi(300, 300, 250);
		//h.poln(5);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		h.razporedi(300, 300, 250);
		System.out.println(f.povezan());
		System.out.println(g.povezan());
		System.out.println(h.povezan());
		System.out.println("Konec programa");
		
		Graf h1 = Graf.polnDvodelen(5, 5);
		h1.razporedi(300, 300, 250);
		
		Okno okno = new Okno();
		okno.pack();
		okno.setVisible(true);
		okno.platno.narisi(h1);

	}

}
