import mojabiblioteka.*;
public class Jedzenie{
	private Spoon sp;
	private Knife kn;
	private Fork fo;
	private Plate pl;
	private DinnerPlate dn;
	public Jedzenie( int kolor, int dlugosc)
	{
		sp = new Spoon(kolor, dlugosc);
		kn = new Knife( kolor, dlugosc);
		fo = new Fork( kolor, dlugosc);
		dn = new DinnerPlate(kolor);
		pl = new Plate(kolor);
		Print.print("Konstruktor klasy JEdzenie");
		
	}
	public static void main(String[] args)
	{
		Jedzenie jedzonko = new Jedzenie (3,4);
	}
}


class Plate {
	int kolor;
	Plate(int kolor)
	{
		this.kolor = kolor;
		Print.print("Konstruktor klasy Plate");
		
	}	
}

class DinnerPlate extends Plate{
	DinnerPlate(int kolor){
		super(kolor);
		Print.print("uruchomiony konstruktor klasy DinnerPlate");
	}
}

class Utensil{
	int kolor;
	Utensil (int kolor)
	{
		this.kolor = kolor;
		Print.print("Urochomiony konstruktor klasy Utensil");
	}
}

class Spoon extends Utensil{
	int dlugosc;
	Spoon( int kolor, int dlugosc){
		super(kolor);
		this.dlugosc = dlugosc;
		Print.print("Urochomiony konstruktor klasy Spoon");
		
		
	}
}
class Fork extends Utensil{
	int dlugosc;
	Fork( int kolor, int dlugosc){
		super(kolor);
		this.dlugosc = dlugosc;
		Print.print("Urochomiony konstruktor klasy Fork");
		
		
	}
}
class Knife extends Utensil{
	int dlugosc;
	Knife( int kolor, int dlugosc){
		super(kolor);
		this.dlugosc = dlugosc;
		Print.print("Urochomiony konstruktor klasy Knife");
		
		
	}
}
