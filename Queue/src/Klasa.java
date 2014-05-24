public class Klasa {
static int funkcja ( int i)
{
	return 10/i;
}
	
	
	public static void main(String[] args)
	{
		try{
			int i =0;
			if(i==0)
			{
				throw new Exception();
			}
			else{
			System.out.println(funkcja(i));
			}
	}catch(Exception e)
	{
		System.out.println("rzucam wyjatek");
	}
		
}
}
