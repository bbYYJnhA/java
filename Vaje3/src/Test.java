
public class Test {

	public static void main(String[] args) {
<<<<<<< HEAD
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
		Graf h = Graf.poln(10);		
=======
		Graf g = Graf.cikel(42);
		g.razporedi(300, 300, 250);
		Graf h = Graf.poln(5);
>>>>>>> 163ac0c9dc2402b292982a394cdc409d0ee492f9
		//h.poln(5);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(f.povezan());
		System.out.println(g.povezan());
		System.out.println(h.povezan());
		System.out.println("Konec programa");
		Okno okno = new Okno();
		okno.pack();
		okno.setVisible(true);
		okno.platno.narisi(g);

	}

}
