import test.TEST;
public class Flower {

	int zmienna =0;
	String s = "null";
	Flower(int i)
	{
		zmienna = i;
		System.out.println("Wywolanie konstruktora ze zmienna");
	}
	
	Flower(String s)
	{
		this.s = s;
		System.out.println("Wywolanie konstruktora ze stringiem");
	}
	
	Flower(String s, int i)
	{
		this(s);
		this.zmienna = i;
		System.out.println("Wywolanie konstruktora ze stringiem i zmienna");
	}
	public static void main(String [] args)
	{
		Flower nowy = new Flower(4);
		Flower nowy1 = new Flower("cokolwiek");
		Flower nowy2 = new Flower("str", 6);
		System.out.println("Zmienna: " + nowy2.zmienna + " String: " + nowy2.s);
		System.out.println("Zmienna: " + nowy1.zmienna + " String: " + nowy1.s);
		System.out.println("Zmienna: " + nowy.zmienna + " String: " + nowy.s);
		TEST nowy5 = new TEST(4,5);
		System.out.println(nowy5.zmienna2);
		
	}
}