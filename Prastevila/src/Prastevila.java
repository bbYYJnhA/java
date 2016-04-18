
public class Prastevila {
	
	// TODO
	
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int p = prastevilo(n);
		System.out.println(p);

	}
	private static int prastevilo(int n){
		int[] pra = new int[n];
		pra[0] = 2;
		int p = 3; // kandidat za naslednje praštevilo
		for (int i=1; i < n; i += 1){
			// ali je p praštevilo
			boolean smoNasli = false;
			while (!smoNasli){
				int j = 0;
				while ((pra[j]*pra[j])<= p; p%(pra[j]) != 0; p += 1){ j += 1; }
				if (j == i){
					// ni bilo deljitelja
					smoNasli = true;
					pra[i] = p;
					}
			p += 1;
		}}
		return pra[n-1];
	}

}
