
public class Outer {

	Inner funkcja(double a)
	{
		Inner nowy = new Inner(a);
		System.out.println(nowy.a);
		return nowy;
	}
	class Inner{
		double a;
		Inner(double a)
		{
			this.a = a;
		}
		
	}
		
	public static void main(String[] args)
	{
		Outer a = new Outer();
		Inner nowy = a.funkcja(5);
		System.out.println(nowy.a);
	}
}
