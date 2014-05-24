import java.util.*;
import java.util.regex.Pattern;
import java.lang.reflect.*;
class Klasa{
	int a;
	int b;
	void wypisz()
	{
		System.out.println("a: " +a );
		System.out.println("b: " +b); 
	}
	Klasa(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
}

public class ShowMetods {

	//private static Pattern p = Pattern.compile("\\w+\\");
	public static void main(String[] args)
	{
		try{
			
		Class<?> c = Class.forName("Klasa");
		Method[] metody = c.getMethods();
		Constructor[] con = c.getConstructors();
		
		System.out.println("xxxxxxxxxxxxMetodyxxxxxxxxxxx");
		for(Method m : metody)
		{
			System.out.println(m);
		}
		System.out.println("xxxxxxxxKonstruktoryxxxxxxxxx");
		for(Constructor<?> co : con)
		{
			System.out.println(co);
		}
		
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		}
	
}
