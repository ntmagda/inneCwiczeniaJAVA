package krotki;

public class Tuple<T> {
	public final T first;
	
	public String toString()
	{
		return "pierwsza:" + first + "\n";
	}
	
	Tuple(T a)
	{
		first = a;
	}

}
