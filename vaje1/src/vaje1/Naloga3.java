package vaje1;
import java.io.*;

public class Naloga3 {
	
	public static int steviloBesed(String ime) throws IOException
	{
		int stevec = 0;
		BufferedReader vhod = new BufferedReader(
				new FileReader(ime));
		while(vhod.ready()){
			String vrstica = vhod.readLine().trim();
			String [] besede = vrstica.split(" +");
			stevec += besede.length;
		}
		vhod.close();
		return stevec;
	}
	
	public static void main(String[] args) throws IOException
	{
		System.out.println(steviloBesed("U:\\workspace\\vaje1\\src\\vaje1\\Naloga2.java"));

	}

}
