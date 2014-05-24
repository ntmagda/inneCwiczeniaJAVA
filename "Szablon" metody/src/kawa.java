
public class kawa {
	public <T> T funkcja(T a)
	{
		return a;
	}
	
	public static void main(String[] arg)
	{
	
		kawa k = new kawa();
		String a = k.funkcja("ssss");
		System.out.println(a);
	}
}
