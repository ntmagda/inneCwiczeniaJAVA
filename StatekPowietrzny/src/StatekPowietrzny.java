
public class StatekPowietrzny extends SystemKontrolny{

	private String name;
	public StatekPowietrzny(String name)
	{
		this.name = name;
	}
	public String toString() { return name;}
	public static void main(String[] args)
	{
		StatekPowietrzny alfa = new StatekPowietrzny("alfa");
		alfa.forward(200);
		alfa.back(89);
		System.out.println("UP: " + alfa.Up);
		System.out.println("FORWARD: " + alfa.Forward);
	}
	
}
