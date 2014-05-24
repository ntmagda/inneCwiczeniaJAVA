
public class Akcja extends Event{
	
	public Akcja(long delayTime) // konstruktor 
	{
		super(delayTime);
	}
	
	public void action()
	{
		System.out.println("Wykonuje sie akcja");
	}

}
