
public class TablicaDouble 
{

	public static void main(String[] args)
	{
		double[] tablica = tworzTablica(5,1.0,6.0);
		wypiszTablica(tablica);
	}
	
	static double[] tworzTablica(int rozmiar, double poczatek, double koniec)
	{
		double[] tablica= new double[rozmiar];
		double iterator;
		iterator = (koniec - poczatek)/(rozmiar+1);
		for ( int i =1; i <rozmiar; i ++)
		{
			tablica[0] = poczatek;
			tablica[i] = poczatek+(i+1)* iterator;
		}
		return tablica;
	}
	
	static void wypiszTablica(double[] tablica)
	{
		for ( int i= 0; i < tablica.length; i++)
		{
			System.out.println(tablica[i]);
		}
	}
	
}
