import java.util.*;
public class Gerbil {
	private int GerbilNumber;
	Gerbil(int Number)
	{
		GerbilNumber = Number;
	}
	
	public void hop()
	{
		System.out.println("Gerbil Number: " + GerbilNumber + " wykonuje podskoki");
		
	}
	
	public static void main(String[] args)
	{
		ArrayList<Gerbil> lista = new ArrayList<Gerbil>();
		Gerbil pierwszy = new Gerbil(3456);
		Gerbil drugi = new Gerbil(45);
		Gerbil trzeci = new Gerbil(34);
		Gerbil czwarty = new Gerbil(4567);
		
		lista.add(pierwszy);
		lista.add(drugi);
		lista.add(trzeci);
		lista.add(czwarty);
		
		for (Gerbil x : lista)
		{
			x.hop();
		}
	}

}
