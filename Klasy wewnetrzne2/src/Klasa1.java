
public class Klasa1 {
	class KlasaWew1{
		private int value = 100;
		public int value(){return value;}
		KlasaWew1(int s)
		{
			value = s;
		}
		KlasaWew1(){}
		void print()
		{
			System.out.println("Zmienna value: " + value);
		}
		
	}
	
	class KlasaWew2{
		private String i = "Ala ma kota";
		public String value(){return i;}
		KlasaWew2(String s)
		{
			i =s;
		}
		KlasaWew2(){}
		
		void print()
		{
			System.out.println("Zmienna i " + i);
		}
		
	}
	
	public KlasaWew2 funkcja(String s)
	{
		return new KlasaWew2(s);
	}
	public KlasaWew1 funkcja1(int s)
	{
		return new KlasaWew1(s);
	}
	
	public void wypisz()
	{
		KlasaWew2 a = new KlasaWew2();
		KlasaWew1 b = new KlasaWew1();
		a.print();
		b.print();
		
	}
	
	public static void main(String[] args)
	{
		Klasa1 klasa = new Klasa1();
		klasa.wypisz();
		Klasa1 klasa1 = new Klasa1();
		Klasa1.KlasaWew1 y = klasa.funkcja1(4);
		Klasa1.KlasaWew2 x = klasa.funkcja("b;asdsad");
		klasa1.wypisz();
		y.print();
		x.print();
		
	}
	
	
	
}
