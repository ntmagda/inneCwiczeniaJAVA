package kwiat;
import ogrod.*;
public class Kwiat {

	int ilosclisci;
	void kwitnie(){
		System.out.println("kwiat kwitnie");
	}
	 public Platek metoda()
	{
		return new Platek();
	}
	
	protected class Platek implements Ogrod
	{
		public void Platek(){}
		public void kolor(){
			System.out.println("Kolor Kawiatka jest czerwony");
		}
	}
}
