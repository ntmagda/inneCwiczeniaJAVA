package krotki;

class A{
	int a;
	A( int a)
	{
		this.a = a;
		System.out.println("Tworze A");
		System.out.println(a);
	}
}
class B{
	int a;
	B( int a)
	{
		this.a = a;
		System.out.println("Tworze B");
		System.out.println(a);
	}
}
class C{
	int a;
	C( int a)
	{
		this.a = a;
		System.out.println("Tworze C");
		System.out.println(a);
	}
}
class D{
	int a;
	D( int a)
	{
		this.a = a;
		System.out.println("Tworze D");
		System.out.println(a);
	}
}

public class Glowna {


	public static void main(String[] args)
	{
		FourTuple<Integer, Integer,Integer,Integer> tupla1 = new FourTuple<Integer,Integer,Integer,Integer>(1,3,5,6);

		System.out.println(tupla1.toString());
	
		
		System.out.println("AAAAAAAAAAAAAAAAAAAAAAaa");
	Tuple<Integer> nowy = new Tuple<Integer>(3);
	String a = nowy.toString();
	System.out.println(a);
	//TwoTuple<Integer> nowy2 = new TwoTuple<Integer>(3, 456);
	
	
	}
}














