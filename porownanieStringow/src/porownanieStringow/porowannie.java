package porownanieStringow;

public class porowannie {
	public static void main(String[] args)
	{
		String str1 = " blabla1";
		String  str2 = " blabla";
		boolean wynik = porownanie(str1, str2);
		System.out.println("Wynik to:" + wynik);
		
	}
	
	static boolean porownanie(String str1, String str2)
	{
		return str1==str2 ? true : false;
	}

}
