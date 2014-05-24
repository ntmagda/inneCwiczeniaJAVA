
class MojaKlasa{
	
	static int wzrost = 153;
	static String imie = "Magda";
	public String toString()
	{
		return "Twoje imie to:" + imie + "\n" +
				" Masz:" +  Double.toString(wzrost) + "wzrostu\n";
	}
	MojaKlasa(int w, String i)
	{
		wzrost = w;
		imie = i;
	}
}

class Ja extends MojaKlasa{
	static String brat = "Szymon";
	public String toString()
	{
		return super.toString() + "Twoj brat ma na imie" + brat + "\n";
	}
	Ja(int w, String i, String b)
	{
		super(w,i);
		brat = b;
	}
}


public class Klasa {

	String[] tablica = new String[7];
	static Class<? extends MojaKlasa> b = Ja.class;
	static Class<?> c = MojaKlasa.class;
	static Class<? extends Number> a = float.class;
	static Class<?> e = String[].class;
	
	public static void main(String[] args)
	{
		MojaKlasa f = new Ja(20,"Magda","Szymon");
		Class<MojaKlasa> mojaklasatyp = MojaKlasa.class;
		MojaKlasa h = mojaklasatyp.cast(f); // skomplikowane rzutowanie w sumie niewiadomo po co 
		//lepiej tak:
			h = (MojaKlasa)f;
		a = double.class;
		System.out.println(b);
		System.out.println(c);
		System.out.println(Ja.imie);
		System.out.println(e.getName());
	}
	}
