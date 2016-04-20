import java.util.ArrayList;

public class Prastevila {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		for (Integer p : prastevila(n)) {
			System.out.println(p);
		}
	}

	/**
	 * @param n
	 * @return seznam praštevil do n
	 */
	private static ArrayList<Integer> prastevila(int n) {
		ArrayList<Integer> pra = new ArrayList<Integer>();
		pra.add(2);
		for (int p = 3; p <= n; p += 2) {
			boolean jePrastevilo = true;
			for (int q : pra) {
				if (p % q == 0) {
					// nasli smo delitelja
					jePrastevilo = false;
					break;
				}
				if (q * q > p) { break; }
			}
			if (jePrastevilo) {
				pra.add(p);
			}
		}
		return pra;
	}
	
	/**
	 * @param n
	 * @return n-to praštevilo
	 */
	@SuppressWarnings("unused")
	private static int prastevilo(int n) {
		int[] pra = new int[n];
		pra[0] = 2;
		int p = 3; // kandidat za naslednje praštevilo
		for (int i = 1; i < n; i += 1) {
			// iscemo naslednje prastevilo
			boolean smoNasli = false;
			while (!smoNasli) {
				// ali je p prastevilo?
				int j = 0;
				while ((pra[j] * pra[j] <= p) && (p % pra[j] != 0)) { j += 1; }
				if (pra[j] * pra[j] > p) {
					// ni bilo delitelja, p je prastevilo
					smoNasli = true;
					pra[i] = p;
				}
				p += 1;
			}
		}
		return pra[n-1];
	}

}