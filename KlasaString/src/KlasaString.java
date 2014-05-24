
public class KlasaString 
{
	public static void main(String[] args)
	{
		new Jakas();
		Jakas nowa = new Jakas();
		System.out.println("nowa.pierwszy: " + nowa.pierwszy);
		System.out.println("nowa.drugi" + nowa.drugi);
		System.out.println("nowa.trzeci"+ Jakas.trzeci);
		System.out.println("nowa.czwarty"+ nowa.czwarty);
	}
}

class Jakas
{
	static String trzeci = " moj statyczny trzeci";
	static String czwarty = " moj statyczny czwarty";		
	String pierwszy; 
	String drugi = " moj drugi string";
	Jakas()
	{
		czwarty = " moj statyczny czwarty2";
		pierwszy =" moj pierwszy string";
	}
	
}
