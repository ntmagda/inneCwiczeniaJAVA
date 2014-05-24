
public class MetodaFinalize {
	public static void main(String[] args)
	{
		Klasa nowa = new Klasa(5);
		System.out.println("nowa.i: " + nowa.i);
		Klasa nowa1 = new Klasa(3);
		System.gc();
	}

	
}

class Klasa
{
	Klasa(int i)
	{
		this.i =i;
	}
	
	int i;
	public void finalize()
	{
		if(this.i!=0)
		{
			System.out.println("zanim usune obiekt i musi sie rownac 0!!");
		}
		
	}
}

