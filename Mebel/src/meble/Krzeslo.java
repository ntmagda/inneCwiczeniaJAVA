package meble;

public class Krzeslo extends Mebel{
	void wypisz(){
		System.out.println("Krzesło:");
		super.wypisz();		
	}
	
	Krzeslo(){};
	Krzeslo(double wys, double sz, double dl)
	{
		super(wys,sz,dl);
		System.out.println("Wywolanie konstruktora klasy krzesło");
	}
	public static void main(String[] args)
	{
		Krzeslo krzeselko = new Krzeslo();
		krzeselko.wypisz();
		Krzeslo krzeselko1 = new Krzeslo(1.3,1.4,4.7);
		krzeselko1.wypisz();
		//System.out.println("");
		//Mebel mebel = new Mebel();
		//mebel.wypisz();
	}

}
