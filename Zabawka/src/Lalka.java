
interface Lalka1 {
	void spiewa();

}

interface DuzaLalka extends Lalka1{
	void glosnospiewa();
}

interface GrubaLalka extends Lalka1{
	void niskospiewa();
}

class Lala 
	implements DuzaLalka, GrubaLalka
	{
		public void spiewa(){ System.out.println("SPIEWA");}
		public void glosnospiewa(){System.out.println("GLOSNO SPIEWA");}
		public void niskospiewa(){System.out.println("NISKO SPIEWA");}

	
	
	}

public class Lalka{

	public static void spiewa(Lalka1 x){x.spiewa();}
	public static void glosnospiewa(DuzaLalka x){x.glosnospiewa();}
	public static void niskospiewa(GrubaLalka x){x.niskospiewa();}
	
	public static void main(String[] args)
	{
		Lala x = new Lala();
		spiewa(x);
		glosnospiewa(x);
		niskospiewa(x);
	}
}

