//demonstracja zachowania skracającego operatorów logicznych
public class Test 
{
	static boolean test1(int val)
	{
		System.out.println("test1("+ val +")");
		System.out.println("wynik: "+(val <1));
		return val <1;
	}
	
	static boolean test2(int val)
	{
		System.out.println("test2("+val+")");
		System.out.println("wynik: "+(val<2));
		return val <2;
	}
	
	static boolean test3(int val)
	{
		System.out.println("test3("+val+")");
		System.out.println("wynik:"+(val<3));
		return val <3;
	}
	public static void main(String[] args)
	{
		if(test1(0) && test2(1) && test3 (2))
			System.out.println("Wyraznie jest prawdziwe");
		else 
			System.out.println("Wyrazenie jest NIE prawdziwe");
	}
}
