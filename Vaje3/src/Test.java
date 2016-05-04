
public class Test {

	public static void main(String[] args) {
		Graf g = Graf.cikel(42);
		g.razporedi(300, 300, 250);
		Graf h = Graf.poln(5);
		//h.poln(5);
		System.out.println(g);
		System.out.println(h);
		System.out.println("Konec programa");
		Okno okno = new Okno();
		okno.pack();
		okno.setVisible(true);
		okno.platno.narisi(g);

	}

}
