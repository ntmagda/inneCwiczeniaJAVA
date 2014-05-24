

class MyException extends Exception{
	MyException()
	{
		System.out.println("Throws MyException");
	}
}

public class FailingConstructor{
	int a;
	int b;
	
	FailingConstructor(int a, int b) throws MyException
	{
		
			this.a=a;
		if(this.a==9)
			{
				throw new MyException();
			}
		this.b=b;
		
		
	}
	
	public static void main(String[] args)
	{
		FailingConstructor nowy = new FailingConstructor(9,6);
		System.out.println(nowy.a);
		System.out.println(nowy.b);
	
		
	}

}
