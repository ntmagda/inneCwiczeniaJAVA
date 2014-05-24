
public class Cwiczenie1 {
	int x;
	double y;
	Cwiczenie1()
	{
		System.out.println("Konstruktor domyslny pracuje");
		x = 2;
		y = 3.3;
	}
	Cwiczenie1(String jakis)
	{
		System.out.println("Konstruktor przeciazony pracuje i wypisuje: " + jakis);
		x = 2;
		y = 3.3;
	}
	
	public static void main(String[] args)
	{
		Cwiczenie1 nowyobiekt = new Cwiczenie1();
		Cwiczenie1 nowyobiekt2 = new Cwiczenie1( "blabla");
		Cwiczenie1[] tablica = 
				{
				new Cwiczenie1(),
				new Cwiczenie1(),
				new Cwiczenie1(),
				new Cwiczenie1(),
				};
		tablica[0] = nowyobiekt;
		tablica[1] = nowyobiekt2;
		System.out.println("nowyobiekt.x: " + nowyobiekt.x);
		System.out.println("nowyobiekt.y: " + nowyobiekt.y);
		System.out.println("tablica[0].x: " + tablica[0].x);
		System.out.println("tablica[1].x: " + tablica[1].x);
		System.out.println("tablica[2].x: " + tablica[2].x);
		System.out.println("tablica[2].y: " + tablica[2].y);
		
		
		
		
		
	}
}

