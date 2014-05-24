
public class Glowna {
	
	public static void main(String[] args)
	{	
		Akcja akcja = new Akcja(200000);
		Akcja2 akcja2 = new Akcja2(1043555555);
		Akcja akcjax = new Akcja(10343);
		
		Controller lista = new Controller();
		lista.addEvent(akcja);
		lista.addEvent(akcja2);
		lista.addEvent(akcjax);
		lista.run();
	}

}
