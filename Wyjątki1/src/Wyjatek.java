
class SimpleException extends Exception{}

public class Wyjatek{
	public void f() throws SimpleException
	{
		System.out.println("Wyrzucam wyjątek SimpleException z f()");
		throw new SimpleException();
	}
	
	public static void main(String[] agrs)
	{
		Wyjatek wyj = new Wyjatek();
		try{
			wyj.f();
			
		}catch(SimpleException a)
		{
			System.err.println("PRzechwycony");
		}
	}

}
