package krotki;

public class TwoTuple<T,A> extends Tuple<T>{

	public final A second;
	
	public String toString()
	{
		return super.toString() + "Druga: " + second + "\n";
	}
	TwoTuple(T a, A b)
	{
		super(a);
		second = b;
		
	}
	
}
