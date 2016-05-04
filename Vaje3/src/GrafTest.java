import static org.junit.Assert.*;

import org.junit.Test;

public class GrafTest {
	Graf f = new Graf();
	Tocka x = new Tocka(5);
	Tocka y = new Tocka(7);
	Tocka z = new Tocka("krneki");
	Graf g = Graf.cikel(100);
	Graf h = Graf.poln(10);
	@Test
	public void testPovezan() {
		Boolean rezultat = f.povezan();
		assertEquals(true, rezultat);
		f.dodajTocko(x);		
		rezultat = f.povezan();
		assertEquals(true, rezultat);
		f.dodajTocko(y);
		rezultat = f.povezan();
		assertEquals(false, rezultat);
		f.dodajPovezavo(x, y);
		rezultat = g.povezan();
		assertEquals(true, rezultat);
		rezultat = h.povezan();
		assertEquals(true, rezultat);
		rezultat = f.povezan();
		assertEquals(true, rezultat);
		f.dodajTocko(z);
		rezultat = f.povezan();
		assertEquals(false, rezultat);
		f.dodajPovezavo(x, z);
		rezultat = f.povezan();
		assertEquals(true, rezultat);
		f.odstraniPovezavo(x, y);
		rezultat = f.povezan();
		assertEquals(false, rezultat);
	}

}
