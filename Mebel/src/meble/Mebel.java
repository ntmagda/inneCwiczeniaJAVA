package meble;

public class Mebel {

	double wysokosc;
	double szerokosc;
	double dlugosc;
	double objetosc;
	double v(double a,double b,double c)
	{
		return a*b*c;
	}
	void wypisz(){
		System.out.println("Wysokosc: " +wysokosc);
		System.out.println("Szerokosc: " +szerokosc);
		System.out.println("Dlugosc: " +dlugosc);
		System.out.println("Objetosc: " +objetosc);
	}
	
	Mebel(double wys,double sz,double dl)
	{
		wysokosc = wys;
		szerokosc = sz;
		dlugosc = dl;
		objetosc = v(wys,sz,dl);
	}
	Mebel()
	{
		System.out.println("Wywolanie konstruktora klasy mebel");
	}
}
