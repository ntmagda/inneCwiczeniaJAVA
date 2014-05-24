 
abstract public class Gryzon {
	
	int liczbaKonczyn;
	abstract public void dzwiek();
	static public void statyczna()
	{
		System.out.println("vdfvdfd");
	}
	
	public static void main(String[] args)
	{
		Generator gen = new Generator();
		Gryzon[] tablica = new Gryzon[9];
		for(int i =0; i < 9; i++)
		{
			tablica[i] = gen.next();
			System.out.println("Liczba konczyn: " +tablica[i].liczbaKonczyn);
			System.out.println("Dzwiek: ");
			tablica[i].dzwiek();
			
		}
		statyczna();
	}

}
