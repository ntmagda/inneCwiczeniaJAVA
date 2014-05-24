
class MyException extends Exception {

	public MyException(){}
	public MyException(String s){
		
		super(s); // wywolanie konstruktora klasy Exception
	}
	
}
public class Wyjatek {

	public static void f() throws MyException
	{
		System.out.println("Wyrzucam wyjatek z f()");
		throw new MyException("wyjatek");
		
	}
	
	public static void g() throws MyException
	{
		System.out.println("Wyrzucany z g()");
		throw new MyException();
		
	}
	public static void main(String[] args)
	{
		try{
			g();
			g();
		}catch(MyException e){
			System.out.println("taki wyjatek");
			e.printStackTrace();
		}
	}
	
}
