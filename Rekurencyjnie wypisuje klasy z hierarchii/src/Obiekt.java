
class Obiekt2
{
	int liczba;
}
class Obiekt3 extends Obiekt2{
	int liczba2;
}

class Obiekt4 extends Obiekt3{
	int liczba3;
}

public class Obiekt {
	
	static void metoda(Class c)
	{
		if(c.getSuperclass()!=null)
			System.out.println(c.getSuperclass());
			metoda(c.getSuperclass());
			
	}
	
	public static void main(String[] args)
	{
		try{
		Class ob = Obiekt4.class;
		metoda(ob);
		System.out.println("Dfgh");
		}catch(Exception e)
		{
			e.printStackTrace();;
		}
	}

}
