
abstract public class CzłonekRodziny {

	String imie;
	String nazwisko;
	CzłonekRodziny(String imie1, String nazwisko1){
		imie = imie1;
		nazwisko = nazwisko1;
	};
	CzłonekRodziny(){};
	static void Statyczna(CzłonekRodziny a)
	{
		Syn synek = (Syn)a;
		synek.MadroscSyna();
		
	}
	
	public static void main(String[] args)
	{
		Syn ja = new Syn("Magda", "Nowak-Trzos");
		CzłonekRodziny.Statyczna(ja);
		
	}
	
}

class Syn extends CzłonekRodziny{
	int wiek;
	Syn(String imie1, String nazwisko1)
	{
		super( imie1, nazwisko1);
		wiek = 20;
	}
	void MadroscSyna()
	{
		System.out.println("Syn pije duzo alkoholu");
	}
	

	
}
