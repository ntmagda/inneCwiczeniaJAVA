
public class Amphibian {
	double waga;
	String kolor;
	Amphibian(){};
	Amphibian(double w, String k)
	{
		waga =w;
		kolor = k;
	}	
	static double ZasiegSkoku(double wsp, Amphibian a)
	{
		System.out.println("Wywoluje metode Amphibian");
		return a.waga*wsp;
	}
	
	public static void main(String[] args)
	{
		Amphibian gad = new Amphibian(5.8,"czerwony");
		Frog zaba = new Frog(7.9,"zielony",10);
		System.out.println("Zasieg skoku zwyklego gada:" + Amphibian.ZasiegSkoku(0.9,gad));
		System.out.println("Zasieg skoku zaby:" + Frog.ZasiegSkoku(1.9,zaba));
	}
}

class Frog extends Amphibian{
	int Palce;
	Frog(){};
	static double ZasiegSkoku(double wsp, Amphibian a)
	{
		System.out.println("Wywoluje metode z forga");
		return a.waga*wsp;
	}
	Frog(double w, String k, int p){
		super(w,k);
		Palce = p;
	}
}
