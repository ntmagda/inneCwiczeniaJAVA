
import java.util.*;
public class Generator {
	static Random rand = new Random();
	static public char next()
	{
		return (char)rand.nextInt(128);
	}
	public static void generate(int count){	
		for ( int i =0; i <count ;i++)
		{
		
			System.out.println(next());
		}
	}
	
	public static void main(String[] args)
	{
	
		generate(100);
	}
}


