package vaje1;

import java.util.Set;
import java.util.TreeSet;

public class Naloga1napredno {

	public static Set<Integer> deljitelji(int n)
	{
		TreeSet<Integer> mnozica = new TreeSet<Integer>();
		for(int i = 1; i<=n; i++)
		{
			if(n%i==0){
			mnozica.add(i);
			}
		}
		return mnozica;
	}

	public static void main(String[] args){
		for(Integer x : deljitelji(60)){
			System.out.println(x);
		}
	}
}