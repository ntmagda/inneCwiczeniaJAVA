class Produkt{
	String nazwa;
	double cena;
	
	public String toString()
	{
		return String.format("%-15s %5s\n", nazwa, cena);
	}
}

public class Paragon {
	
	Produkt[] tablica_prod;
	Paragon(int liczba_prod)
	{
		tablica_prod= new Produkt[liczba_prod];
	}
	void UzupelnijProd()
	{
		for(int i =0; i <tablica_prod.length; i++)
		{
			tablica_prod[i] = new Produkt();
			tablica_prod[i].nazwa = " Produkt nr:" + i;
			tablica_prod[i].cena = 3*i;
		}
	}
	
	public void printTotal()
	{
		for( int i =0 ; i <tablica_prod.length; i++)
		{
			System.out.println(String.format("%5s\n", tablica_prod[i].toString()));
		}
	}


	public static void main(String[] args)
	{
		Paragon par = new Paragon (8);
		par.UzupelnijProd();
		par.printTotal();
	}
}
