
public class Cwiczenie3 
{

	public static void main(String[] args)
	{
		Dog pies = new Dog();
		pies.bark();
		pies.bark(4);
		pies.bark(4.5);
		
		pies.bark(1,1.4);
		pies.bark(1.4,1);
		
		
	}
	
}

class Dog
{
	void bark()
	{
		System.out.println("Zwykle szczekniecie");
	}
	void bark(int i)
	{
		System.out.println("Szczekniecie z wyciem tylko " + i + "razy");
	}
	void bark(double i)
	{
		System.out.println("Samo zawycie" + i + "raza");
	}
	
	void bark( double i, int k)
	{
		System.out.println("Najpierw szczeka double, potem szcze int");
	}
	
	void bark( int i, double k)
	{
		System.out.println("Najpierw szczeka int potem double");
	}
	
}
