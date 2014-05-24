
interface inter1{
	String readlabel();
}

interface inter2{
	int value();
}

public class Klasa1 {
	private class KlasaWew1 implements inter2
	{
		int value;
		public int value(){
			value = 7;
			return value;
		}
	}
	protected class KlasaWew2 implements inter1{
		
		String label;
		
		KlasaWew2(String s){
			label = s;
			
		}
	
		public String readlabel(){
			return label;
		}
		
	}
	
	protected class KlasaWew3 implements inter1{
			
		String label;
		
		KlasaWew3(String s){
			label = "sdadsd" + s;
		}
		public String readlabel()
		{
			return label;
		}
		public inter1 funkcja(){
			class KlasaWewWew3 implements inter1{
				private String label;
				KlasaWewWew3(String s)
				{
					label =s;
				}
				public String readlabel()
				{
					return label;
				}
			}
			KlasaWewWew3 nowa_wew = new KlasaWewWew3("wewnetrzna wewnetrzna klasa ");
			return nowa_wew;
		}
		
	}
	
	public void metoda( inter1 a)
	{
		System.out.println(a.readlabel());
	}
	
	public static void main(String[] args){
		Klasa1 a = new Klasa1();
		Klasa1.KlasaWew1 b = a.new KlasaWew1();
		Klasa1.KlasaWew2 c = a.new KlasaWew2("ala mama");
		Klasa1.KlasaWew3 d = a.new KlasaWew3("bababa");
		a.metoda(d);
		a.metoda(c);
		Klasa1.KlasaWew3 e = a.new KlasaWew3("dasdas");
		inter1 f =  e.funkcja(); //zrzutowane
		System.out.println("dsggggggggggggggggggggg");
		System.out.println(f.readlabel());
		
		
		
		
	}
}











