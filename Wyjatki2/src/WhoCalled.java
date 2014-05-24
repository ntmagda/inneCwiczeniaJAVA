import java.util.*;

public class WhoCalled {

	static void f()
	{
	try {
		throw new Exception();
	}catch(Exception e)
	{
		for(StackTraceElement elementstosu : e.getStackTrace()) // zwraca tablice elemntow ze stosu
		{
			System.out.println(elementstosu);
		}
	}
}
	static void g()
	{
		f();
	}
	
	public static void main(String[] args)
	{
		f();
		g();
		
	}
}
