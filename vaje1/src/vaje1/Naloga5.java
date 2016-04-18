package vaje1;
import java.io.*;
import java.util.ArrayList;

public class Naloga5 {

	public static ArrayList<String> tabelaPrekrskarjev(String ime) throws IOException
	{
		//int stevec = 0;
		ArrayList<String> prekrskarji = new ArrayList<String>();
		BufferedReader vhod = new BufferedReader(
				new FileReader(ime));
		while(vhod.ready()){
			String vrstica = vhod.readLine().trim();
			String [] hitrost = vrstica.split(" +");
			
			if (Integer.parseInt(hitrost[0]) > 22.22){
				prekrskarji.add(vrstica);
			}
			//String [] besede = vrstica.split(" +");
			//stevec += besede.length;
		}
		vhod.close();
		return prekrskarji;
	}
	public static void main(String[] args) throws IOException
	{
		PrintWriter izhod = new PrintWriter(new FileWriter("test.txt"));
		ArrayList<String> prekrskarji = tabelaPrekrskarjev("podatki.txt");
		int i = prekrskarji.size();
		int j = 0;
		while(i>0){
			izhod.println(prekrskarji.get(j));
			i -= 1;
			j+=1;
		}
		izhod.close();
	}
	}


