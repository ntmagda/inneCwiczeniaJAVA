import java.util.Arrays;


public class Zdanie {
	
	static void matches(String s)
	{
		System.out.println(s.matches("^[A-Z].*[\\.]$"));
	}
	
	static String[] podziel(String s)
	{
		return s.split("w|za");
	}
	
	static void zastap(String s)
	{
		System.out.println(s.replaceAll("[aąeiouóyAĄEIOUÓY]", "_"));
	}
	
	public static void main(String[] args)
	{
		matches("sla.");
		String s = "ala w zalodze ma w nosie bardza kota w lesie";
		System.out.println( Arrays.toString(podziel(s)));
		zastap(s);
	}
	
	

}
