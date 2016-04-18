package vaje1;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Naloga2 
{
	public static List<Vector<Integer>> prafaktorji(int number)
	{
		int n = number;
		List<Vector<Integer>> faktorji = new ArrayList<Vector<Integer>>();
		for (int i = 2; i <= n; i++)
		{
		      while (n % i == 0) 
		      {
		    	  Vector<Integer> vektor = new Vector<Integer>();
		    	  vektor.add(i);		    	  
		    	  vektor.add(1);
		          faktorji.add(vektor);
		          n /= i;
		      }
		}
		return faktorji;
	}
	public static void main(String[] args) 
	{
		System.out.println(prafaktorji(60));

	}

}
