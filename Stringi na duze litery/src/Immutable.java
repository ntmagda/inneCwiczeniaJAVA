
public class Immutable {

	static String naDuzeLitery(String s)
	{
		return s.toUpperCase();
	}
	
	static String naMaleLitery (String s)
	{
		return s.toLowerCase();
	}
	public static void main(String[] args)
	{
		String s = " kjh sDFFDFdfdgfg";
		System.out.println(naDuzeLitery(s));
		System.out.println(naMaleLitery(s));
		System.out.println(s);
		StringBuilder d = new StringBuilder("Test");
		String[] a = {"kie", "dys", " mia", "lam ", "d", "uzo ", "zaba", "wek."};
		StringBuilder build  = new StringBuilder();
		for ( String e : a)// foreach
		{
			build.append(e);
		}
		System.out.println(build.toString());
		d.append("dfghj"); // laczy stringi
		d.append('d'); 
		System.out.println(d);
	}
}
