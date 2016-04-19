import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;


public class Naloga1 {

	public static Map<String, Integer> frekvenceBesed(String ime) throws IOException
	{
		Map<String, Integer> slovar = new HashMap<String, Integer>();
		BufferedReader vhod = new BufferedReader(
				new FileReader(ime));
		while (vhod.ready()){
		String vrstica = vhod.readLine();
		StringTokenizer st = new StringTokenizer(vrstica, " .,[]<>...");
			while (st.hasMoreTokens()){
				String beseda = st.nextToken();
				if (!slovar.containsKey(beseda)){
					slovar.put(beseda, 1);
				}
				else{
					slovar.put(beseda, slovar.get(beseda)+1);
				}
		}
		}
		vhod.close();
		return slovar;
	}
	
	public static void main(String[] args) throws IOException
	{
		Map<String, Integer> besede = frekvenceBesed("hisa.txt");
		//System.out.println(besede);
		for (String string: besede.keySet()){

            String key = besede.toString();
            String value = besede.get(key).toString();  
            System.out.println(key + " " + value);  


} 
	}
}
