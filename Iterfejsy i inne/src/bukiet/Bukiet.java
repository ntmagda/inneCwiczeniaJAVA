package bukiet;
import kwiat.*;

public class Bukiet extends Kwiat{
	
	public Platek metoda1(){
		Platek plat = metoda();
		return plat;
	}
	
	public static void main(String[] args)
	{
		Bukiet a = new Bukiet();
		Platek plat = a.metoda1();
		plat.kolor();
	}

}
