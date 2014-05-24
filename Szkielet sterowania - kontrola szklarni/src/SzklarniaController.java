
public class SzklarniaController extends Controller{
	boolean light = false;
	int temperatura = 25;
	boolean nawadnianie = false;
	
	
	class Swiatla extends Event
	{
		Swiatla(long delayTime)
		{
			super(delayTime);
		}
		
		public void action()
		{
			System.out.println("Swiatła wlaczone: ");
			light = true;
		}
	}
	
	class Temperatura extends Event
	{
		Temperatura(long delayTime)
		{
			super(delayTime);
		}
		public void action()
		{
			System.out.println("Temperatura zostaje zmieniona na 30 stopni");
			temperatura = 30;
		}
	}
	
	class Nawadnianie extends Event
	{
		Nawadnianie(long delayTime)
		{
			super(delayTime);
		}
		
		public void action()
		{
			System.out.println("Nawadnianie wlaczone");
			nawadnianie = true;
		}
	}
		
	public static void main(String[] args)
	{
		
		
		SzklarniaController szklarnia = new SzklarniaController();
		Swiatla swiatla = szklarnia.new Swiatla(50000);
		Temperatura temp = szklarnia.new Temperatura (3334878);
		Nawadnianie naw = szklarnia.new Nawadnianie(43);
		szklarnia.addEvent(swiatla);
		szklarnia.addEvent(temp);
		szklarnia.addEvent(naw);
		
		szklarnia.run();
	}

}
