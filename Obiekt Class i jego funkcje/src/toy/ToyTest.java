
package toy;

interface HasBatteries{};
interface Waterproof{};
interface Shoots{};
interface Agaga{};

class Toy{

	Toy(){};
	Toy(int i){};
}

class FancyToy extends Toy
implements HasBatteries, Waterproof, Shoots, Agaga{
	FancyToy(int i)
	{
		super(i);
	}
	FancyToy(){};
}
public class ToyTest {
	static void PrintInfo (Class c)
	{
		System.out.println("Nazwa klasy: " + c.getName() + "czy ma interface: " + c.isInterface());
		System.out.println("Nazwa prosta: " + c.getSimpleName());
		System.out.println("Nazwa kanoniczna: " + c.getCanonicalName());
	}
	
	

	public static void main(String[] args) {
	
		Class c = null;
		try{
			c = Class.forName("toy.FancyToy"); // tworzy klase FancyToy
		}catch(Exception e)
		{
			System.out.println("prawdopodobnie nieznaleziono klasy");
			e.printStackTrace();
			System.exit(1);
		}
		PrintInfo(c);
		for(Class cl : c.getInterfaces())
		{
			PrintInfo(cl); // drukuje wszystkie interfacy
		}
		
		Class up = c.getSuperclass();
		Object obj = null;
		try{
			obj = up.newInstance();
		}catch(Exception e)
		{
			System.out.println("Prawdopodobnie nie mozna utworzyc egzemplarza");
			e.printStackTrace();
		}
		
		System.out.println(obj.getClass());

	}

}
