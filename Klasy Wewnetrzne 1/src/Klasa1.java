
public class Klasa1 {
	class KlasaWew1{
		private int i = 100;
		void print()
		{
			System.out.println("Zmienna i: " + i);
		}
	}
	
	class KlasaWew2{
		private String label;
		void print()
		{
			System.out.println("Zmienna String: " + label);
		}
		
	}
	
	public void funkcja()
	{

		KlasaWew1 nowa1 = new KlasaWew1();
		KlasaWew2 nowa2 = new KlasaWew2();
		nowa1.print();
		nowa2.print();
	}

	public static void main(String[] args)
	{
		Klasa1 nowa = new Klasa1();
		nowa.funkcja();
	}
}
