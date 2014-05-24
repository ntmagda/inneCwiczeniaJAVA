package mojpakiet1;
import mojpakiet.*;
public class Ksiazka implements Przedmiot{
	
	public void opis()
	{
		System.out.println("TO jest ksiazka");
	}
	public int objetosc()
	{
		return (wysokosc*dlugosc*szerokosc)/3;
	}

}
