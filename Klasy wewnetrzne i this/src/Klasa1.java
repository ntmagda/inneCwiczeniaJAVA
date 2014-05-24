
public class Klasa1 {
	private int value = 34;
	class KlasaWew1{
		void metoda1(int value)
		{
			Klasa1.this.value = value;
		}
		
	}
	
	public KlasaWew1 funkcja()
	{
		
		KlasaWew1 nowa = new KlasaWew1();
		return nowa;
	}
	
	public static void main(String[] args)
	{
		Klasa1 nowa = new Klasa1();
		KlasaWew1 a = nowa.funkcja();
		System.out.println(nowa.value);
		a.metoda1(78);
		System.out.println(nowa.value);
		
		Klasa1.KlasaWew1 b = nowa.new KlasaWew1(); // tworzenie obiektu klasy wewnetrznej z maina
		b.metoda1(75);
		System.out.println(nowa.value);
		
		
	}
	


}
