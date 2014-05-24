interface inter1{
	void increment();
}

class Klasa2 implements inter1{
	private int i =0;
	public void increment(){
		System.out.println( " Increment w klasie2");
	}
}

class Klasa3{
	public void increment()
	{
		System.out.println("Increment w klasie3");
	}
	static void funkcja(Klasa3 a){ a.increment();}
}

class Klasa4 extends Klasa3{
	private int i=0;
	public void increment()
	{
		super.increment();
		i++;
		System.out.println("Increment w Klasie4");
	}	


private class Klasa5 implements inter1{
	
	public void increment()
	{
		Klasa4.this.increment();
	}
}

inter1 wywolanieZwrotne()
{
	return new Klasa5();
}

	
}
class Klasa6{
	private inter1 wywolanie;
	Klasa6(inter1 c)
	{
		wywolanie =c;
	}
	void go()
	{
		wywolanie.increment(); // w zaleznosci od tego co przekazemy do konstruktora Klasy6 to taka metoda sie wywoła
	}
}
public class Klasa1 {
	
	public static void main(String[] args)
	{
		Klasa2 a = new Klasa2();
		Klasa4 b = new Klasa4();
		Klasa3.funkcja(b);
		Klasa6 c = new Klasa6(a);
		Klasa6 d = new Klasa6(b.wywolanieZwrotne());
		System.out.println("sddddddd");
		c.go();
		System.out.println("sddddddd");
		d.go();
		c.go();
		d.go();
		
	}

}
