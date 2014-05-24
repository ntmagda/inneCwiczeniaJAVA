package krotki;

public class FourTuple<T,A,B,C> extends ThreeTuple<T,A,B>{
	public final C four;
	FourTuple(T a, A b, B c, C d )
	{
		super(a,b,c);
		four = d;
		
	}
	public String toString()
	{
		return super.toString() + " Czwarta: " +  four + "\n";
	}

}
