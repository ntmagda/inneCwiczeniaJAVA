
public class BezKonstruktora {

	public static void main(String[] args)
	{
		Nowa nowa = new Nowa();
		System.out.println(nowa.i);
		nowa.funkcja1(nowa.i);
		Nowa nowa1 = new Nowa(4.4,5);
		System.out.println("Double: " +nowa1.j + "Int: " + nowa1.i);
		
	}
}

class Nowa{
	int i;
	double j;
	Nowa()
	{
		i =0;
	}
	Nowa ( int i)
	{
		this.i = i;
	}
	
	Nowa(double j, int i)
	{
		this(i);
		this.j = j;
	}
	
	void funkcja2()
	{
		i = 8;
		System.out.println("Twoja zmienna i: " + this.i);
	}
	
	void funkcja1(int i)
	{
		this.funkcja2();
		funkcja2();
		//System.out.println( " Twoja stara zmienna:" + this.i);
	}

}
