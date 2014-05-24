//import java.lang.*;
public class ExceptionMethods {
	public static void main(String[] args)
	{
		try{
			throw new Exception("wyjatek");
		}catch(Exception e)
		{
			System.out.println("e.getMessage" + e.getMessage());
			System.out.println("e.getLocalizedMessage()" + e.getLocalizedMessage());
			System.out.println("e.toString()" + e.toString());
			System.out.println("e.getStackTrace");
			e.getStackTrace();
			e.fillInStackTrace();
			e.getCause();
			e.getSuppressed();
		}
	}

}
