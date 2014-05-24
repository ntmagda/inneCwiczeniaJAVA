
public class Klasa1 {

	Klasa1(){};
	Klasa1(int a){
		pole1 = a;
	}
	private int pole1;
	private void wypiszPole1()
	{
		System.out.println(pole1);
	}
	
	class Klasa2{
		private int a= 199;
		void change(int a)
		{
			pole1 = a;
		}
	}
	
	void metoda()
	{
		Klasa2 mowa = new Klasa2();
		mowa.change(5);
		System.out.println(mowa.a);
	}
	
	public static void main(String[] args)
	{
		Klasa1 nowa = new Klasa1(7);
		System.out.println("Poczatkowa wartosc: " + nowa.pole1);
		nowa.metoda();
		System.out.println("Koncowa wartosc: " + nowa.pole1);
	}
}
