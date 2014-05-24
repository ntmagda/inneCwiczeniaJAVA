
class Klasa1
{
	private int a;
	Klasa1(int a) //konstruktor domyslny 
	{
		this.a = a;
	}
	
}

class Klasa2 extends Klasa1
{
	private int b;
	Klasa2(int a ,int b)
	{
		super(a);
		this.b = b;
	}
}

class Klasa3
{
	int d;
	Klasa3(int d)
	{
		this.d =d;
	}
}
public class Test{


	public static void main(String[] args)
	{
		Klasa1 a = new Klasa1(7);
		Klasa2 b = new Klasa2(8,3);
		Klasa3 c = new Klasa3(44);
		
		
		System.out.println("Porownanie klasy bazowej z klasa pochodna na 3 sposoby: ");
		System.out.println("1.");
	//	System.out.println("Sprawdzanie z instanceof "); 
		System.out.println("Bazowa instanceof pochodna" + (a instanceof Klasa2));
		System.out.println("Pochodna instanceof bazowa" + (b instanceof Klasa1));
		
		System.out.println("2:");
		System.out.println("Pochodna.class.isInstance(Bazowa)" + Klasa2.class.isInstance(a));
		System.out.println("Bazowa.class.isInstance(Pochodna)"+ Klasa1.class.isInstance(b));
		System.out.println("3:");
		System.out.println("bazowa.getClass() == Pochodna.class" + (a.getClass()==Klasa2.class));
//		System.out.println(b.getClass()==Klasa1.class);
		
	}
	
}









