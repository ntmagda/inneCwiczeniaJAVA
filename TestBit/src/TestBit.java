
public class TestBit {
	public static void main(String[] args)
	{
		int a= 8;
		int b = a | 8;
		System.out.println("przesuniete:" + b );
		int c = funkcja(12);
		System.out.println("wywolanie funkcja:" + c );
		laczenieLan();
		
	}

	static int funkcja( int i)
	{
		return (i <10) ? ++i : --i;
	}
	
	//zamiana na łancuchy i operator +
	
	static void laczenieLan()
	{
		int x =0, y = 1, z =2;
		String str = "mama";
		System.out.println(z+y+str+z+str);
	}
}
 