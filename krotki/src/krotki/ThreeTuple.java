package krotki;

public class ThreeTuple<T, A, B> extends TwoTuple<T, A> {
	
	public final  B three;
	ThreeTuple(T a, A b, B c)
	{
		super(a,b);
		three = c;
		
	}
	public String toString()
	{
		return super.toString() + "Trzecia: " +  three + "\n";
	}

}
