import java.util.*;

class Klasa
{
	private int i ;
	String s;
	Klasa(int i, String s)
	{
		this.i =i;
		this.s = s;
	}
	Klasa(){}
	
	public String toString()
	{
		return i + s;
	}
}
public class ArrayListDisplay {
	public static void main(String[] args)
	{

	Klasa pierwsza = new Klasa(5, " Ala");
	Klasa druga = new Klasa(6, "mama");
	Klasa trzecia = new Klasa(4, " agugu");
	List<Klasa> lis = new ArrayList<Klasa>();
	lis.add(pierwsza);
	lis.add(druga);
	lis.add(trzecia);
	
	String a = lis.toString();
	System.out.println(a);
	}
}
