package Initable;
import java.util.*;

class Initable
{
	static final int staticFinal =47;
	static final int staticFinal2 = ClassInitialization.rand.nextInt(1000);
	static{
	System.out.println("Inicjalizacja klasy Initable");
	}
}

class Initable2
{
	static int staticNonFinal = 147;
	static
	{
		System.out.println("Inicjaliacja klasy Initable2");
	}
}

class Initable3
{
	static int StaticNonFinal = 74;
	static
	{
		System.out.println("Inicjalizacja klasy Initable3");
	}
}

public class ClassInitialization {

	public static Random rand = new Random(47);
	public static void main(String[] args)
	{
		Class a = Initable.class;
		System.out.println("Initable.staticFinal");
		System.out.println("Initable.staticFinal2");
		System.out.println("Initable2.staticNonFinal");
		Class ini = Initable3.class;
		System.out.println("Po utworzeniu ini");
		System.out.println(Initable3.StaticNonFinal);
	}
}
