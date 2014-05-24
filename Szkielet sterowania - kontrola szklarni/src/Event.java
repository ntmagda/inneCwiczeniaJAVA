
public abstract class Event {
	private long eventTime;
	long delayTime;
	public Event(long delayTime) // konstruktor 
	{
		this.delayTime = delayTime; // ustawia delayTime
		start(); // ustawia eventTime
	}
	
	public void start()
	{
		eventTime = System.nanoTime() + delayTime; // czas wykonania  = czas systemowy + czas opoznienia
	}
	
	public boolean ready()
	{
		return System.nanoTime() >= eventTime; // zwraca true, jak juz powinien byc eventTime
	}
	
	public abstract void action(); // jakas tam akcja okreslana w dziedziczacych klasach

}
