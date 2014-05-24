import java.util.*;
public class Kolejka {
	
	int rozmiar;
	Kolejka(int rozmiar)
	{
		this.rozmiar = rozmiar;
	}
	Queue<Command> kolejka = new LinkedList<Command>();
	void wstawianie()
	{
		for( int i =0 ; i<rozmiar;i++)
		{
			Command a = new Command();
			kolejka.add(a);
		}
	}
	Command peek()
	{
		return kolejka.peek();
	}

	public static void main(String[] args)
	{
		
		Kolejka kol = new Kolejka(10);
		kol.wstawianie();
		for( int i=0; i <kol.rozmiar;i++)
		{
			System.out.println("    ");
			kol.peek().operation();
		}
		
	}
}

